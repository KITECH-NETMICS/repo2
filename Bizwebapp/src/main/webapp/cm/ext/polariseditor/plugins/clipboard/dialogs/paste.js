﻿POLARIS.dialog.add("paste",function(d){function h(a){var b=new POLARIS.dom.document(a.document),e=b.getBody(),c=b.getById("polaris_actscrpt");c&&c.remove();e.setAttribute("contenteditable",!0);e.append(b.createText("​"));if(POLARIS.env.ie&&8>POLARIS.env.version)b.getWindow().on("blur",function(){b.$.selection.empty()});b.on("keydown",function(a){a=a.data;var b;switch(a.getKeystroke()){case 27:this.hide();b=1;break;case 9:case POLARIS.SHIFT+9:this.changeFocus(1),b=1}b&&a.preventDefault()},this);d.fire("ariaWidget",
new POLARIS.dom.element(a.frameElement));b.getWindow().getFrame().removeCustomData("pendingFocus")&&e.focus()}var f=d.lang.clipboard;d.on("pasteDialogCommit",function(a){a.data&&d.fire("paste",{type:"auto",dataValue:a.data})},null,null,1E3);return{title:f.title,minWidth:POLARIS.env.ie&&POLARIS.env.quirks?370:350,minHeight:POLARIS.env.quirks?250:245,onShow:function(){this.parts.dialog.$.offsetHeight;this.setupContent();this.parts.title.setHtml(this.customTitle||f.title);this.customTitle=null},onLoad:function(){(POLARIS.env.ie7Compat||
POLARIS.env.ie6Compat)&&"rtl"==d.lang.dir&&this.parts.contents.setStyle("overflow","hidden")},onOk:function(){this.commitContent()},contents:[{id:"general",label:d.lang.common.generalTab,expand:!0,heights:["","","100%"],style:"width: 100%; height: 100%;",elements:[{type:"html",id:"securityMsg",html:'\x3cdiv style\x3d"white-space:normal;width:100%"\x3e'+f.securityMsg+"\x3c/div\x3e"},{type:"html",id:"pasteMsg",html:'\x3cdiv style\x3d"white-space:normal;width:100%"\x3e'+f.pasteMsg+"\x3c/div\x3e"},{type:"html",
id:"editing_area",style:"width:100%;height:100%",html:"",focus:function(){var a=this.getInputElement(),b=a.getFrameDocument().getBody();!b||b.isReadOnly()?a.setCustomData("pendingFocus",1):b.focus()},setup:function(){var a=this.getDialog(),b='\x3chtml dir\x3d"'+d.config.contentsLangDirection+'" lang\x3d"'+(d.config.contentsLanguage||d.langCode)+'"\x3e\x3chead\x3e\x3cstyle\x3ebody{margin:3px;height:95%}\x3c/style\x3e\x3c/head\x3e\x3cbody\x3e\x3cscript id\x3d"polaris_actscrpt" type\x3d"text/javascript"\x3ewindow.parent.POLARIS.tools.callFunction('+
POLARIS.tools.addFunction(h,a)+",this);\x3c/script\x3e\x3c/body\x3e\x3c/html\x3e",e=POLARIS.env.air?"javascript:void(0)":POLARIS.env.ie?"javascript:void((function(){"+encodeURIComponent("document.open();("+POLARIS.tools.fixDomain+")();document.close();")+'})())"':"",c=POLARIS.dom.element.createFromHtml('\x3ciframe class\x3d"polaris_pasteframe" frameborder\x3d"0"  allowTransparency\x3d"true" src\x3d"'+e+'" role\x3d"region" aria-label\x3d"'+f.pasteArea+'" aria-describedby\x3d"'+a.getContentElement("general",
"pasteMsg").domId+'" aria-multiple\x3d"true"\x3e\x3c/iframe\x3e');c.on("load",function(a){a.removeListener();a=c.getFrameDocument();a.write(b);d.focusManager.add(a.getBody());POLARIS.env.air&&h.call(this,a.getWindow().$)},a);c.setCustomData("dialog",a);a=this.getElement();a.setHtml("");a.append(c);if(POLARIS.env.ie){var g=POLARIS.dom.element.createFromHtml('\x3cspan tabindex\x3d"-1" style\x3d"position:absolute" role\x3d"presentation"\x3e\x3c/span\x3e');g.on("focus",function(){setTimeout(function(){c.$.contentWindow.focus()})});
a.append(g);this.focus=function(){g.focus();this.fire("focus")}}this.getInputElement=function(){return c};POLARIS.env.ie&&(a.setStyle("display","block"),a.setStyle("height",c.$.offsetHeight+2+"px"))},commit:function(){var a=this.getDialog().getParentEditor(),b=this.getInputElement().getFrameDocument().getBody(),d=b.getBogus(),c;d&&d.remove();c=b.getHtml();c=c.replace(/\u200B( )?/g,function(a){return a[1]?" ":""});setTimeout(function(){a.fire("pasteDialogCommit",c)},0)}}]}]}});