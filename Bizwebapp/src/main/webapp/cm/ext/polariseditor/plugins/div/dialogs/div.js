﻿(function(){function f(a,m){function f(){this.foreach(function(b){/^(?!vbox|hbox)/.test(b.type)&&(b.setup||(b.setup=function(a){b.setValue(a.getAttribute(b.id)||"",1)}),b.commit||(b.commit=function(a){var d=this.getValue();if("dir"!=b.id||a.getComputedStyle("direction")!=d)d?a.setAttribute(b.id,d):a.removeAttribute(b.id)}))})}function q(b){function a(b,c){if(b)for(var d=b.elements,e=0,f;e<d.length;e++)if(f=d[e],f=f.getStyle(c))return f;return null}var d=[],g=b.getSelection();g.getRanges();var g=g.getStartElement(),
h=b.elementPath(g),g={},e={};g["line-height"]=b.config.documentLineHeight?b.config.documentLineHeight:a(h,"line-height");e["font-family"]=b.config.documentFontFamily?b.config.documentFontFamily:a(h,"font-family");e["font-size"]=b.config.documentFontSize?b.config.documentFontSize+"pt":a(h,"font-size");var h=new POLARIS.dom.element("p"),f=new POLARIS.dom.element("span");f.setStyles(e);f.setHtml("\x26#8203;");h.append(f);h.setStyles(g);divElement=new POLARIS.dom.element("div",b.document);divElement.setAttribute("doc-data-role",
"polaris-textbox");divElement.setAttribute("ondragstart","return false");divElement.append(h);b.insertElementWithBlockSplit(divElement);d.push(divElement);return d}(function(){var b=POLARIS.tools.extend({},POLARIS.dtd.$blockLimit);a.config.div_wrapTable&&(delete b.td,delete b.th);return b})();var n={type:"html",html:"\x26nbsp;"},p=a.plugins.uicolor,e=[],k=POLARIS.tools.getNextId()+"_divBgColorPanel",l=POLARIS.tools.getNextId()+"_divBorderColorPanel";return{title:a.lang.div.title,minWidth:244,minHeight:160,
resizable:POLARIS.DIALOG_RESIZE_NONE,contents:[{id:"info",label:a.lang.common.generalTab,title:a.lang.common.generalTab,elements:[{type:"hbox",children:[{type:"text",id:"width",style:"width:78px;","default":"50",maxLength:3,label:a.lang.common.width,validate:function(){var b=this.getValue(),c=!!POLARIS.dialog.validate.integer()(b),b=POLARIS.tools.getContentSizeToUnit(a,"mm").width;c?(c=this.getValue(),c=!!(0<c&&c<b),c||(alert(a.lang.div.invalidWidth.replace("%1",b-1)),this.setValue(b-1),this.select())):
alert(a.lang.common.invalidWidth);return c},setup:function(b){b=b.getStyle("width");var c=parseInt(b,10);b.replace(/[0-9|.]/g,"")!=a.lang.common.unitMm&&(b=POLARIS.tools.convertToPx(b),c=POLARIS.tools.convertPxToMm(b),c=c.toFixed(0));this.setValue(c)},commit:function(b){var c=parseInt(this.getValue(),10);isNaN(c)?b.removeStyle("width"):b.setStyle("width",c+a.lang.common.unitMm);b.removeAttribute("width")}},{type:"vbox",children:[{type:"html",html:"\x26nbsp;"},{type:"html",html:a.lang.common.unitMm}]},
{type:"text",id:"height",style:"width:78px;",maxLength:3,"default":"20",label:a.lang.common.height,validate:function(){var b=this.getValue(),c=!!POLARIS.dialog.validate.integer()(b),b=POLARIS.tools.getContentSizeToUnit(a,"mm").height;c?(c=this.getValue(),c=!!(0<c&&c<b),c||(alert(a.lang.div.invalidHeight.replace("%1",b-1)),this.setValue(b-1),this.select())):alert(a.lang.common.invalidHeight);return c},setup:function(b){var c=b.getStyle("min-height"),d=parseInt(c,10);isNaN(d)&&(c=b.getstyle("height"),
d=parseInt(c,10));c.replace(/[0-9|.]/g,"")!=a.lang.common.unitMm&&(b=POLARIS.tools.convertToPx(c),d=POLARIS.tools.convertPxToMm(b),d=d.toFixed(0));this.setValue(d)},commit:function(b){var c=parseInt(this.getValue(),10);isNaN(c)?b.removeStyle("min-height"):b.setStyle("min-height",c+a.lang.common.unitMm);b.removeAttribute("height");b.removeStyle("height");POLARIS.tools.setTimeout(function(){var c=b.getClientRect().height;a.pagination&&(c=100*c/a.pagination.getScaleRatio());c=POLARIS.tools.convertPxToMm(c);
b.setStyle("min-height",c+a.lang.common.unitMm)},0,this)}},{type:"vbox",children:[{type:"html",html:"\x26nbsp;"},{type:"html",html:a.lang.common.unitMm}]}]},{id:"radioFloat",type:"radio",items:[[a.lang.div.alignInitial,"none"],[a.lang.div.alignLeft,"left"],[a.lang.div.alignRight,"right"]],"default":"none",label:a.lang.div.align,setup:function(b){b=b.getStyle("float");"left"==b?this.setValue("left"):"right"==b?this.setValue("right"):this.setValue("none")},commit:function(b){b.setStyle("float",this.getValue())}},
{type:"hbox",styles:["vertical-align:top"],children:[{id:"txtBorder",type:"select",width:"120px",requiredContent:"div[border]","default":a.lang.div.borderWidth[2][0],label:a.lang.div.divBorder,items:[[a.lang.div.borderWidth[0][0],a.lang.div.borderWidth[0][1]],[a.lang.div.borderWidth[1][0],a.lang.div.borderWidth[1][1]],[a.lang.div.borderWidth[2][0],a.lang.div.borderWidth[2][1]],[a.lang.div.borderWidth[3][0],a.lang.div.borderWidth[3][1]],[a.lang.div.borderWidth[4][0],a.lang.div.borderWidth[4][1]],[a.lang.div.borderWidth[5][0],
a.lang.div.borderWidth[5][1]],[a.lang.div.borderWidth[6][0],a.lang.div.borderWidth[6][1]],[a.lang.div.borderWidth[7][0],a.lang.div.borderWidth[7][1]],[a.lang.div.borderWidth[8][0],a.lang.div.borderWidth[8][1]],[a.lang.div.borderWidth[9][0],a.lang.div.borderWidth[9][1]],[a.lang.div.borderWidth[10][0],a.lang.div.borderWidth[10][1]],[a.lang.div.borderWidth[11][0],a.lang.div.borderWidth[11][1]],[a.lang.div.borderWidth[12][0],a.lang.div.borderWidth[12][1]],[a.lang.div.borderWidth[13][0],a.lang.div.borderWidth[13][1]],
[a.lang.div.borderWidth[14][0],a.lang.div.borderWidth[14][1]],[a.lang.div.borderWidth[15][0],a.lang.div.borderWidth[15][1]],[a.lang.div.borderWidth[16][0],a.lang.div.borderWidth[16][1]]],setup:function(b){(b=b.getStyle("border-width"))&&b.replace(/[0-9|.]/g,"")!=a.lang.common.unitMm&&(b=POLARIS.tools.convertToPx(b),b=POLARIS.tools.convertPxToMm(b),b=b.toFixed(1)+a.lang.common.unitMm);this.setValue(b)},commit:function(b){var c=parseFloat(this.getValue());isNaN(c)||b.setStyle("border-width",c+a.lang.common.unitMm)}},
{id:"divBorderStyle",type:"select",width:"120px",requiredContent:"div[border]","default":"solid",label:a.lang.div.divBorderStyle,items:[[a.lang.div.borderStyle.border_none,"none"],[a.lang.div.borderStyle.border_dotted,"dotted"],[a.lang.div.borderStyle.border_dashed,"dashed"],[a.lang.div.borderStyle.border_solid,"solid"]],setup:function(b){this.setValue(b.getStyle("border-style")||"none")},commit:function(b){"none"!=this.getValue()?b.setStyle("border-style",this.getValue()):b.removeStyle("border-style")}}]},
{type:"hbox",styles:["vertical-align:top"],children:[{type:"html",id:"divBgColor",html:'\x3cp style\x3d"height:16px;\x3e\x3cspan\x3e'+a.lang.div.divBgColor+'\x3c/span\x3e\x3c/p\x3e\x3cdiv id\x3d"'+k+'"class\x3d"polaris_dialog_ui_colorpanel" style\x3d"width: 78px;"\x3e\x3c/div\x3e',setup:function(b){var a=b.getAttribute("bgColor");b=b.getStyle("background-color")||a;POLARIS.document.getById(k).setStyle("background-color",b)},commit:function(b){var a=POLARIS.document.getById(k),d=a.getStyle("background-color");
d?b.setStyle("background-color",d):b.removeStyle("background-color");b.removeAttribute("bgColor");a.removeStyle("background-color")}},p?{type:"button",id:"divBgColorChoose","class":"colorChooser",label:a.lang.common.chooseColor,onLoad:function(){this.getElement().getParent().setStyle("vertical-align","bottom")},onClick:function(){a.getUIColorFromDialog(function(b){b&&POLARIS.document.getById(k).setStyle("background-color",b)},this)}}:n,{type:"html",id:"divBorderColor",html:'\x3cp style\x3d"height:16px;\x3e\x3cspan\x3e'+
a.lang.div.divBorderColor+'\x3c/span\x3e\x3cp\x3e\x3cdiv id\x3d"'+l+'"class\x3d"polaris_dialog_ui_colorpanel" style\x3d"width: 78px; background-color: #000000"\x3e\x3c/div\x3e',setup:function(b){var a=b.getAttribute("borderColor");b=b.getStyle("border-color")||a||"#000000";POLARIS.document.getById(l).setStyle("background-color",b)},commit:function(b){var a=POLARIS.document.getById(l),d=a.getStyle("background-color");d?b.setStyle("border-color",d):b.removeStyle("border-color");b.removeAttribute("border-color");
a.setStyle("background-color","#000000")}},p?{type:"button",id:"divBorderColorChoose","class":"colorChooser",label:a.lang.common.chooseColor,onLoad:function(){this.getElement().getParent().setStyle("vertical-align","bottom")},onClick:function(){a.getUIColorFromDialog(function(a){a&&POLARIS.document.getById(l).setStyle("background-color",a)},this)}}:n]}]},{id:"advanced",label:a.lang.common.advancedTab,title:a.lang.common.advancedTab,hidden:!0,elements:[{type:"vbox",padding:1,children:[{type:"text",
id:"id",requiredContent:"div[id]",label:a.lang.common.id,"default":""},{type:"text",id:"lang",requiredContent:"div[lang]",label:a.lang.common.langCode,"default":""},{type:"text",id:"title",requiredContent:"div[title]",style:"width: 100%;",label:a.lang.common.advisoryTitle,"default":""},{type:"select",id:"dir",requiredContent:"div[dir]",style:"width: 100%;",label:a.lang.common.langDir,"default":"",items:[[a.lang.common.notSet,""],[a.lang.common.langDirLtr,"ltr"],[a.lang.common.langDirRtl,"rtl"]]}]}]}],
onLoad:function(){f.call(this);this.getContentElement("info","elementStyle");a.getStylesSet(function(a){})},onShow:function(){"editdiv"==m&&this.setupContent(this._element=POLARIS.plugins.div.getSurroundDiv(a))},onOk:function(){if("editdiv"==m)e=[this._element];else{if(POLARIS.plugins.div.getSurroundDiv(a))return;a.pagination&&a.pagination.adjustCaret(a);e=q(a,!0)}for(var b=e.length,c=0;c<b;c++)this.commitContent(e[c]),!e[c].getAttribute("style")&&e[c].removeAttribute("style");this.hide()},onHide:function(){"editdiv"==
m&&this._element.removeCustomData("elementStyle");delete this._element}}}POLARIS.dialog.add("creatediv",function(a){return f(a,"creatediv")});POLARIS.dialog.add("editdiv",function(a){return f(a,"editdiv")})})();