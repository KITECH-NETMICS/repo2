﻿(function(){POLARIS.dialog.add("movement",function(c){var f=POLARIS.plugins.link,g=function(){for(var a=this.getDialog(),b=["anchorOptions","pageOptions"],d=this.getValue(),c=0;c<b.length;c++){var e=a.getContentElement("info",b[c]);e&&(e=e.getElement().getParent().getParent(),b[c]==d+"Options"?e.show():e.hide())}a.layout();"page"==this.getValue()&&(a=a.getContentElement("info","pageNumber"))&&a.focus()},d=c.lang.movement,b;return{title:d.label,minWidth:244,minHeight:40,resizable:POLARIS.DIALOG_RESIZE_NONE,
contents:[{id:"info",label:c.lang.common.generalTab,title:c.lang.common.generalTab,elements:[{id:"linkType",type:"radio",items:[[d.toAnchor,"anchor"],[d.toPage,"page"]],"default":"anchor",onChange:g,onClick:g,setup:function(a){this.setValue(a.type||"anchor")}},{type:"vbox",id:"anchorOptions",children:[{type:"vbox",id:"selectAnchorText",setup:function(){b=f.getEditorAnchors(c);this.getElement()[b&&b.length?"show":"hide"]()},children:[{type:"vbox",id:"selectAnchor",children:[{type:"select",id:"anchorName",
"default":"",label:d.anchorName,style:"width: 100%;",items:[[""]],setup:function(a){this.clear();if(b)for(var c=0;c<b.length;c++)b[c].name&&this.add(b[c].name);a.anchor&&this.setValue(a.anchor.name);(a=this.getDialog().getContentElement("info","linkType"))&&"page"==a.getValue()&&this.focus()},validate:function(){var a=this.getDialog().getContentElement("info","linkType");return a&&"anchor"==a.getValue()&&!this.getValue()?(alert(d.message.noAnchor),!1):!0}}],setup:function(){this.getElement()[b&&b.length?
"show":"hide"]()}}]},{type:"html",id:"noAnchors",html:'\x3cdiv role\x3d"note" tabIndex\x3d"-1" style\x3d"outline:0"\x3e'+POLARIS.tools.htmlEncode(d.noAnchors)+"\x3c/div\x3e",focus:!0,setup:function(){this.getElement()[b&&b.length?"hide":"show"]()}}],setup:function(){this.getDialog().getContentElement("info","linkType")||this.getElement().hide()}},{type:"vbox",id:"pageOptions",children:[{type:"text",id:"pageNumber",label:d.page,validate:function(){var a=this.getDialog().getContentElement("info","linkType");
if(a&&"page"==a.getValue()){if(!this.getValue())return alert(d.message.errorPageNumberEmpty),!1;a=parseInt(POLARIS.tools.trim(this.getValue()));if(isNaN(a)||0==a)return alert(d.message.pageNumberError),!1;var b=c.document.find("[polaris-page]");if(!b||b.count()<a)return alert(d.message.exceedPages),!1}return!0}}],setup:function(){this.getDialog().getContentElement("info","linkType")||this.getElement().hide()}}]}],onShow:function(){var a=this.getParentEditor(),a=f.parseLinkAttributes(a,null);this.setupContent(a)},
onOk:function(){var a=this.getContentElement("info","linkType");a&&"anchor"==a.getValue()?(a=this.getContentElement("info","anchorName"))&&(a=f.getElementByFakeAnchorId(c,a.getValue()))&&a.scrollIntoView():a&&"page"==a.getValue()&&(a=this.getContentElement("info","pageNumber"),a=parseInt(POLARIS.tools.trim(a.getValue())),(a=c.document.findOne('[polaris-page\x3d"'+a+'"]'))&&(a=a.findOne('[doc-data-role\x3d"polaris-page-content"]'))&&a.scrollIntoView&&a.scrollIntoView())}}})})();