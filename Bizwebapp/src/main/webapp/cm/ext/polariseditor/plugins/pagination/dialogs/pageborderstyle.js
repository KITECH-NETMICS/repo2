﻿(function(){POLARIS.dialog.add("pageoutlinebg",function(d){function g(a,b,c){return function(){var e=this.getValue().trim(),e=!!(POLARIS.dialog.validate.integer()(e)&&e>=b&&e<c+1);e||(alert(a),this.select());return e}}function k(a){0==a.getContentElement("page","borderTop").getValue()&&0==a.getContentElement("page","borderBottom").getValue()&&0==a.getContentElement("page","borderLeft").getValue()&&0==a.getContentElement("page","borderRight").getValue()&&a.getContentElement("page","selPageBorderStyle").setValue("none")}
function l(a){"none"==a.getContentElement("page","selPageBorderStyle").getValue()&&a.getContentElement("page","selPageBorderStyle").setValue("solid")}var c=d.lang.pagination,p=d.plugins.uicolor,b=d.plugins.pagination.pageInfo,m=POLARIS.tools.getNextId()+"_borderColorPanel",n=POLARIS.tools.getNextId()+"_backgroundColorPanel";return{title:c.pageoutlinebg,minWidth:250,minHeight:180,resizable:POLARIS.DIALOG_RESIZE_NONE,contents:[{id:"page",label:c.pageoutlinebg,elements:[{type:"vbox",children:[{type:"hbox",
widths:["50%","50%"],children:[{type:"hbox",widths:["80%","20%"],children:[{type:"text",id:"txtLeftMargin",label:c.pageBorderStyle.leftMargin,validate:g(c.pageBorderStyle.invalidLeftMargin,0,25),"default":"5",setup:function(){if(b.borderLeftMargin){var a=parseInt(b.borderLeftMargin);0<=a&&this.setValue(a+"")}}},{type:"vbox",children:[{type:"html",html:"\x26nbsp;"},{type:"html",html:c.outline.pageUnit}]}]},{type:"hbox",widths:["80%","20%"],children:[{type:"text",id:"txtTopMargin",label:c.pageBorderStyle.topMargin,
validate:g(c.pageBorderStyle.invalidTopMargin,0,25),"default":"5",setup:function(){if(b.borderTopMargin){var a=parseInt(b.borderTopMargin);0<=a&&this.setValue(a+"")}}},{type:"vbox",children:[{type:"html",html:"\x26nbsp;"},{type:"html",html:c.outline.pageUnit}]}]}]},{type:"hbox",widths:["50%","50%"],children:[{type:"hbox",widths:["80%","20%"],children:[{type:"text",id:"txtRightMargin",label:c.pageBorderStyle.rightMargin,validate:g(c.pageBorderStyle.invalidRightMargin,0,25),"default":"5",setup:function(){if(b.borderRightMargin){var a=
parseInt(b.borderRightMargin);0<=a&&this.setValue(a+"")}}},{type:"vbox",children:[{type:"html",html:"\x26nbsp;"},{type:"html",html:c.outline.pageUnit}]}]},{type:"hbox",widths:["80%","20%"],children:[{type:"text",id:"txtBottomMargin",label:c.pageBorderStyle.bottomMargin,validate:g(c.pageBorderStyle.invalidBottomMargin,0,25),"default":"5",setup:function(){if(b.borderBottomMargin){var a=parseInt(b.borderBottomMargin);0<=a&&this.setValue(a+"")}}},{type:"vbox",children:[{type:"html",html:"\x26nbsp;"},
{type:"html",html:c.outline.pageUnit}]}]}]},{type:"hbox",widths:["70%","30%"],hidden:d.config.useImageBase64Encoding,children:[{type:"text",id:"txtPageBackgroundImage",label:c.pageBorderStyle.pageBackgroundImage,setup:function(){var a=b.backgroundImage||"",a="none"==a?"":a.replace(/url\(\s*(["']?)\s*([^\)]*)\s*\1\s*\)/i,function(a,b,c){return c});this.setValue(a)}},{type:"vbox",filebrowser:"uploadButton2",label:d.lang.image.upload,children:[{type:"file",id:"upload2",style:"width:100%",hidden:!0,label:d.lang.image.btnUpload,
size:38},{type:"fileButton",id:"uploadButton2",style:"width:100%",filebrowser:"page:txtPageBackgroundImage",label:d.lang.image.btnUpload,"for":["page","upload2"]}]}]},{type:"select",id:"repeat",hidden:d.config.useImageBase64Encoding,label:c.pageBorderStyle.repeatLabel,"default":"repeat",items:d.config.useDocConvertServer?[[c.pageBorderStyle.repeat,"repeat"],[c.pageBorderStyle.horizontalRepeat,"repeat-x"],[c.pageBorderStyle.verticalRepeat,"repeat-y"]]:[[c.pageBorderStyle.notRepeat,"no-repeat"],[c.pageBorderStyle.repeat,
"repeat"],[c.pageBorderStyle.horizontalRepeat,"repeat-x"],[c.pageBorderStyle.verticalRepeat,"repeat-y"]],setup:function(){var a=b.backgroundRepeat||"";""==a?d.config.useDocConvertServer?this.setValue("repeat"):this.setValue("no-repeat"):this.setValue(a)}},{type:"hbox",widths:["50%","50%"],children:[{type:"select",id:"selPageBorderStyle",label:c.pageBorderStyle.pageBorderStyle,"default":"solid",items:[[c.pageBorderStyle.borderStyles.border_none,"none"],[c.pageBorderStyle.borderStyles.border_solid,
"solid"],[c.pageBorderStyle.borderStyles.border_double,"double"],[c.pageBorderStyle.borderStyles.border_dashed,"dashed"],[c.pageBorderStyle.borderStyles.border_dotted,"dotted"]],setup:function(){b.borderStyle&&this.setValue(b.borderStyle)},onChange:function(){var a=this.getDialog().getContentElement("page","borderTop").getValue(),b=this.getDialog().getContentElement("page","borderBottom").getValue(),c=this.getDialog().getContentElement("page","borderLeft").getValue(),e=this.getDialog().getContentElement("page",
"borderRight").getValue(),d=this.getDialog().getContentElement("page","selPageBorderStyle").getValue(),f=POLARIS.document.getById("polaris_border_style_preview");1==a&&f.setStyle("border-top-style",d);1==b&&f.setStyle("border-bottom-style",d);1==c&&f.setStyle("border-left-style",d);1==e&&f.setStyle("border-right-style",d);"none"==this.getValue()&&(this.getDialog().getContentElement("page","borderTop").setValue(!1),this.getDialog().getContentElement("page","borderBottom").setValue(!1),this.getDialog().getContentElement("page",
"borderLeft").setValue(!1),this.getDialog().getContentElement("page","borderRight").setValue(!1))}},{type:"text",id:"txtPageBorderWidth",label:c.pageBorderStyle.pageBorderWidth,maxLength:2,validate:g(c.pageBorderStyle.invalidPageBorder,0,10),"default":"1",setup:function(){b.borderWidth&&this.setValue(b.borderWidth)},onChange:function(){POLARIS.document.getById("polaris_border_style_preview").setStyle("border-width",POLARIS.tools.cssLength(parseInt(this.getValue())))}}]},{type:"hbox",widths:["50%",
"50%"],children:[{type:"hbox",widths:["70%","30%"],children:[{type:"html",id:"txtBorderColor",html:"\x3cspan\x3e"+c.pageBorderStyle.pageBorderColor+'\x3c/span\x3e\x3cdiv id\x3d"'+m+'"class\x3d"polaris_dialog_ui_colorpanel" style\x3d"width: 78px; background-color: #000000"\x3e\x3c/div\x3e',setup:function(){var a=b.borderColor?b.borderColor:"#000000";POLARIS.document.getById(m).setStyle("background-color",a);this.getDialog().getContentElement("page","txtBorderColor").setValue(a);this.getDialog().getContentElement("page",
"txtBorderColor").onChange()},onChange:function(){var a=this.getDialog().getContentElement("page","borderTop").getValue(),b=this.getDialog().getContentElement("page","borderBottom").getValue(),c=this.getDialog().getContentElement("page","borderLeft").getValue(),e=this.getDialog().getContentElement("page","borderRight").getValue(),d=this.getDialog().getContentElement("page","txtBorderColor").getValue(),f=POLARIS.document.getById("polaris_border_style_preview");1==a&&f.setStyle("border-top-color",d);
1==b&&f.setStyle("border-bottom-color",d);1==c&&f.setStyle("border-left-color",d);1==e&&f.setStyle("border-right-color",d)}},p?{type:"button",id:"borderColorChoose","class":"colorChooser",label:d.lang.common.chooseColor,width:"100%",onLoad:function(){this.getElement().getParent().setStyle("vertical-align","bottom")},onClick:function(){d.getUIColorFromDialog(function(a){a&&(POLARIS.document.getById(m).setStyle("background-color",a),this.getDialog().getContentElement("page","txtBorderColor").setValue(a),
this.getDialog().getContentElement("page","txtBorderColor").onChange())},this)}}:spacer]},{type:"hbox",widths:["70%","30%"],children:[{type:"html",id:"txtBackgroundColor",html:"\x3cspan\x3e"+c.pageBorderStyle.pageBackgroundColor+'\x3c/span\x3e\x3cdiv id\x3d"'+n+'"class\x3d"polaris_dialog_ui_colorpanel" style\x3d"width: 78px; background-color: #ffffff"\x3e\x3c/div\x3e',setup:function(){var a=b.backgroundColor?b.backgroundColor:"#ffffff";POLARIS.document.getById(n).setStyle("background-color",a);this.getDialog().getContentElement("page",
"txtBackgroundColor").setValue(a);this.getDialog().getContentElement("page","txtBackgroundColor").onChange()},onChange:function(){POLARIS.document.getById("polaris_border_style_preview").setStyle("background-color",this.getValue().toLowerCase())}},p?{type:"button",id:"backgroundColorChoose","class":"colorChooser",label:d.lang.common.chooseColor,width:"100%",onLoad:function(){this.getElement().getParent().setStyle("vertical-align","bottom")},onClick:function(){d.getUIColorFromDialog(function(a){a&&
(POLARIS.document.getById(n).setStyle("background-color",a),this.getDialog().getContentElement("page","txtBackgroundColor").setValue(a),this.getDialog().getContentElement("page","txtBackgroundColor").onChange())},this)}}:spacer]}]},{type:"vbox",children:[{type:"html",html:"\x3cp\x3e"+c.pageBorderStyle.pageBorderSelection+"\x3c/p\x3e"},{type:"vbox",style:"border: 1px solid #a0a2ab; border-radius: 2px; background-color: #fffeff; padding: 5px; height: 100%;",textalign:"center",children:[{type:"html",
html:'\x3cp style\x3d"text-align:center; vertical-align: middle;"\x3e'+c.pageBorderStyle.pageBorderSelectionInfo+"\x3c/p\x3e"},{type:"checkbox",id:"borderTop","default":!1,label:"",setup:function(){b.borderTop&&"none"!=b.borderTop&&(this.setValue(!0),this.onClick())},onClick:function(){var a=POLARIS.document.getById("polaris_border_style_preview");if(1==this.getValue()){var b=this.getDialog().getContentElement("page","txtBorderColor").getValue(),c=this.getDialog().getContentElement("page","selPageBorderStyle").getValue(),
e=this.getDialog().getContentElement("page","txtPageBorderWidth").getValue(),e=POLARIS.tools.cssLength(e);a.setStyle("border-top-color",b);a.setStyle("border-top-style",c);a.setStyle("border-top-width",e);l(this.getDialog())}else a.removeStyle("border-top"),k(this.getDialog())}},{type:"hbox",verticalalign:"middle",widths:["50%","32px","50%"],children:[{type:"checkbox",id:"borderLeft",style:"float:right;","default":!1,label:"",setup:function(){b.borderLeft&&"none"!=b.borderLeft&&(this.setValue(!0),
this.onClick())},onClick:function(){var a=POLARIS.document.getById("polaris_border_style_preview");if(1==this.getValue()){var b=this.getDialog().getContentElement("page","txtBorderColor").getValue(),c=this.getDialog().getContentElement("page","selPageBorderStyle").getValue(),e=this.getDialog().getContentElement("page","txtPageBorderWidth").getValue(),e=POLARIS.tools.cssLength(e);a.setStyle("border-left-color",b);a.setStyle("border-left-style",c);a.setStyle("border-left-width",e);l(this.getDialog())}else a.removeStyle("border-left"),
k(this.getDialog())}},{id:"borderPreview",type:"html",html:'\x3cdiv id\x3d"polaris_border_style_preview" style\x3d"width: 32px; height: 32px;"\x3e\x3c/div\x3e'},{type:"checkbox",id:"borderRight",style:"float:left;","default":!1,label:"",setup:function(){b.borderRight&&"none"!=b.borderRight&&(this.setValue(!0),this.onClick())},onClick:function(){var a=POLARIS.document.getById("polaris_border_style_preview");if(1==this.getValue()){var b=this.getDialog().getContentElement("page","txtBorderColor").getValue(),
c=this.getDialog().getContentElement("page","selPageBorderStyle").getValue(),e=this.getDialog().getContentElement("page","txtPageBorderWidth").getValue(),e=POLARIS.tools.cssLength(e);a.setStyle("border-right-color",b);a.setStyle("border-right-style",c);a.setStyle("border-right-width",e);l(this.getDialog())}else a.removeStyle("border-right"),k(this.getDialog())}}]},{type:"checkbox",id:"borderBottom","default":!1,label:"",setup:function(){b.borderBottom&&"none"!=b.borderBottom&&(this.setValue(!0),this.onClick())},
onClick:function(){var a=POLARIS.document.getById("polaris_border_style_preview");if(1==this.getValue()){var b=this.getDialog().getContentElement("page","txtBorderColor").getValue(),c=this.getDialog().getContentElement("page","selPageBorderStyle").getValue(),e=this.getDialog().getContentElement("page","txtPageBorderWidth").getValue(),e=POLARIS.tools.cssLength(e);a.setStyle("border-bottom-color",b);a.setStyle("border-bottom-style",c);a.setStyle("border-bottom-width",e);l(this.getDialog())}else a.removeStyle("border-bottom"),
k(this.getDialog())}}]}]}]}]}],onShow:function(){b=d.plugins.pagination.pageInfo;var a=[];0<b.borderLeft.length?a=b.borderLeft.split(" "):0<b.borderRight.length?a=b.borderRight.split(" "):0<b.borderTop.length?a=b.borderTop.split(" "):0<b.borderBottom.length&&(a=b.borderBottom.split(" "));for(var c=0;c<a.length;c++)(new RegExp(/none|dashed|double|solid|dotted/g)).test(a[c])?b.borderStyle=a[c]:(new RegExp(/px|em|pt$/g)).test(a[c])?(b.borderWidth=a[c],b.borderWidth=b.borderWidth.replace(/[^.0-9]/g,"")):
b.borderColor=a[c];this.setupContent()},onOk:function(){var a=this.getParentEditor();a.fire("saveSnapshot");var d=(this.getContentElement("page","txtLeftMargin").getValue()||"0")+c.outline.pageUnit,h=(this.getContentElement("page","txtRightMargin").getValue()||"0")+c.outline.pageUnit,e=(this.getContentElement("page","txtTopMargin").getValue()||"0")+c.outline.pageUnit,g=(this.getContentElement("page","txtBottomMargin").getValue()||"0")+c.outline.pageUnit;b.borderLeftMargin=d;b.borderTopMargin=e;b.borderRightMargin=
h;b.borderBottomMargin=g;b.backgroundColor=this.getContentElement("page","txtBackgroundColor").getValue();b.borderColor=this.getContentElement("page","txtBorderColor").getValue();b.borderWidth=this.getContentElement("page","txtPageBorderWidth").getValue();b.borderStyle=this.getContentElement("page","selPageBorderStyle").getValue();b.borderColor||(b.borderColor="#000000");b.borderStyle||(b.borderStyle="solid");b.borderWidth||(b.borderWidth="0");var d=POLARIS.tools.cssLength(b.borderWidth)+" "+b.borderStyle+
" "+b.borderColor,h=this.getContentElement("page","borderTop").getValue(),e=this.getContentElement("page","borderBottom").getValue(),g=this.getContentElement("page","borderLeft").getValue(),f=this.getContentElement("page","borderRight").getValue();b.borderTop=h?d:"";b.borderBottom=e?d:"";b.borderLeft=g?d:"";b.borderRight=f?d:"";b.border="none"==b.borderStyle?!1:!0;(d=this.getContentElement("page","txtPageBackgroundImage").getValue())?(d=d.replace(/ /g,"%20"),b.backgroundImage='url("'+d+'")'):b.backgroundImage=
"";h=this.getContentElement("page","repeat").getValue();b.backgroundRepeat=d&&h?h:"";a.plugins.pagination.updatePageStyle(a);a.fire("saveSnapshot")}}})})();