﻿POLARIS.dialog.add("insertExternalMediaUrl",function(d){function e(){this&&"video"==f&&(this.setAttribute("alt",g.stillEncoding),this.setStyles({"background-image":"url("+POLARIS.getUrl(POLARIS.plugins.get("externalmedia").path+"icons/"+(POLARIS.env.hidpi?"hidpi/":"")+"movie_incoding.png")+")","background-repeat":"no-repeat","background-position":"center"}),this.removeListener("error",e),this.removeListener("abort",e))}var g=d.lang.externalmedia,h=null,k=null,a=null,c=null,m=null,n=null,f=null;window.POLARIS_DIALOG=
null;return{title:g.medialink,minWidth:200,minHeight:140,resizable:POLARIS.DIALOG_RESIZE_NONE,onShow:function(){window.POLARIS_DIALOG=this;POLARIS.tools.extend(this,{onSelectExternalMedia:function(b){this.getContentElement("info","mediaurl").setValue(b.url);this.getContentElement("info","medianame").setValue(b.name);m=b.posterWidth;n=b.posterHeight;var a=this.getContentElement("info","mediathumbnail").getDialog().getElement().getDocument().getById("external_media_image");a.setAttribute("src",b.posterurl);
"video"==f&&(a.on("error",e,a),a.on("abort",e,a))}});var b=this.parts.title.getText();f=b==g.insertvideourl?"video":b==g.insertdocumenturl?"document":null;h=k=a=c=m=n=null;window.document.getElementById("mediaurl").value="";window.document.getElementById("mediatitle").value="";window.document.getElementById("thumbnailurl").value="";window.document.getElementById("thumbnailwidth").value="";window.document.getElementById("thumbnailheight").value="";if(h=(b=this.getSelectedElement())&&b.getAscendant("figure",
1))k=h.findOne("figcaption"),a=h.findOne("img"),c=h.findOne("a");this.setupContent()},onOk:function(){null==h?(h=new POLARIS.dom.element("figure"),k=new POLARIS.dom.element("figcaption"),a=new POLARIS.dom.element("img"),c=new POLARIS.dom.element("a"),c.append(k),c.append(a),h.append(c),h.setAttribute("doc-data-role",f),a.on("error",e),a.on("abort",e),this.commitContent(),this.getContentElement("info","mediaurl").isChanged()&&this.getContentElement("info","medianame").isChanged()&&d.insertElement(h)):
this.commitContent()},contents:[{id:"info",label:"",startupFocus:"btnSelectMedia",elements:[{type:"vbox",children:[{id:"mediaurl",type:"text",style:"width: 200px;",label:g.mediaurl,setup:function(b){c&&c.getAttribute("href")&&this.setValue(c.getAttribute("href"));this.disable()},commit:function(){0!=this.isChanged()&&c&&c.setAttribute("href",this.getValue())}},{id:"medianame",type:"text",style:"width: 200px;",label:g.medianame,setup:function(){k&&k.getChildCount()&&this.setValue(k.getText())},commit:function(){0!=
this.isChanged()&&k&&(k.setHtml(this.getValue()),k.setStyle("text-align","center"))}},{id:"mediathumbnail",type:"html",label:g.mediathumbnail,html:'\x3cimg src\x3d"" style\x3d"width: 200px; height:200px;" id\x3d"external_media_image"\x3e\x3cinput style\x3d"display: none;" type\x3d"text" value\x3d"mediaurl" id\x3d"mediaurl" /\x3e\x3cinput style\x3d"display: none;" type\x3d"text" value\x3d"mediatitle" id\x3d"mediatitle" /\x3e\x3cinput style\x3d"display: none;" type\x3d"text" value\x3d"thumbnailurl" id\x3d"thumbnailurl" /\x3e\x3cinput style\x3d"display: none;" type\x3d"text" value\x3d"thumbnailwidth" id\x3d"thumbnailwidth" /\x3e\x3cinput style\x3d"display: none;" type\x3d"text" value\x3d"thumbnailheight" id\x3d"thumbnailheight" /\x3e',
setup:function(){var b="",l=this.getDialog().getElement().getDocument().getById("external_media_image");a&&(b=a.getAttribute("src"));b?(l.setAttribute("src",b),"video"==f&&(l.on("error",e,l),l.on("abort",e,l))):l.removeAttribute("src");l.removeStyle("background-image");l.removeStyle("background-repeat");l.removeStyle("background-position");l.removeAttribute("alt")},commit:function(){if(a){var b=this.getDialog().getElement().getDocument().getById("external_media_image").getAttribute("src");a.setAttribute("src",
b);a.setAttribute("title",d.lang.link.tooltip);m&&a.setStyle("width",m+"px");n&&a.setStyle("height",n+"px");"video"==f&&(a.on("error",e,a),a.on("abort",e,a))}}},{id:"btnSelectMedia",style:"width:100%",type:"button",label:g.selectvideo,setup:function(){"video"==f?this.getElement().setHtml(g.selectvideo):"document"==f&&this.getElement().setHtml(g.selectdocument);this.focus()},onClick:function(){var b="";"video"==f&&d.config.externalVideoLinkUrl?b=d.config.externalVideoLinkUrl:"document"==f&&d.config.externalDocumentLinkUrl&&
(b=d.config.externalDocumentLinkUrl);if(b){window.POLARIS.OnSelectExternalMedia=function(a){a&&(window.document.getElementById("mediaurl").value=a.mediaurl,window.document.getElementById("mediatitle").value=a.mediatitle,window.document.getElementById("thumbnailurl").value=a.thumbnailurl,window.document.getElementById("thumbnailwidth").value=a.thumbnailwidth,window.document.getElementById("thumbnailheight").value=a.thumbnailheight);a=window.document.getElementById("mediaurl").value;var b=window.document.getElementById("mediatitle").value,
c=window.document.getElementById("thumbnailurl").value,d=window.document.getElementById("thumbnailwidth").value,e=window.document.getElementById("thumbnailheight").value;window.POLARIS_DIALOG.onSelectExternalMedia({url:a,name:b,posterurl:c,posterWidth:d,posterHeight:e})};var a=function(a){var b=document.createElement("a");b.href=a;return b.protocol+"//"+b.host}(b);if(window.addEventListener){var c=function(b){b.origin===a&&"OnSelectExternalMedia"===b.data.functionName&&window.POLARIS.OnSelectExternalMedia(b.data.params)};
POLARIS.env.ie?window.addEventListener("onmessage",c,!1):window.addEventListener("message",c,!1)}d.popup(b,620,600,d.config.filebrowserWindowFeatures||d.config.fileBrowserWindowFeatures,function(a){a.postMessage("POLARIS.MSG.GetVideo",b)})}}}]}]}]}});