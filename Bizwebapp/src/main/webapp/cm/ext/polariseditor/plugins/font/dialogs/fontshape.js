﻿(function(){POLARIS.dialog.add("fontShape",function(e){function u(a,b,c,d){e.ui.addButton(a,{label:b,toolbar:"dialog_property_button",click:d?d:function(){var b=q(),c=new POLARIS.dom.range(b.getDocument());c.selectNodeContents(b);this.getState()==POLARIS.TRISTATE_ON?(h[a].removeFromRange(c),this.setState(POLARIS.TRISTATE_OFF)):(h[a].applyToRange(c),this.setState(POLARIS.TRISTATE_ON))}});if(b=e.ui.create(a))c.push('\x3cli class\x3d"polaris_dialog_property_button"\x3e'),b.className=b.className?b.className+
" polaris_dialog_button":"polaris_dialog_button",b.render(e,c),c.push("\x3c/li\x3e");v.push(b);r[a]=b}function q(){var a=POLARIS.document.getById(y);if(a)return a.getFrameDocument().getById(F)}function w(a){return"false"==a.getAttribute("contentEditable")||a.getAttribute("data-nostyle")}function J(a,b,c,d){new POLARIS.style(d);a=c.split(";");c=[];for(var e={},g=0;g<a.length;g++){var f=a[g];if(f){var f=f.split("/"),h={},k=a[g]=f[0];h[b]=c[g]=f[1]||k;e[k]=new POLARIS.style(POLARIS.tools.extend({ignoreReadonly:1},
d,!0),h);e[k]._.definition.name=k}else a.splice(g--,1)}return e}function z(a,b){var c=e.elementPath(),d=c.contains(function(b){return a.checkElementRemovable(b)});if(d){var n=b.checkBoundaryOfElement(d,POLARIS.START),g=b.checkBoundaryOfElement(d,POLARIS.END);if(n&&g){for(n=b.createBookmark();c=d.getFirst();)c.insertBefore(d);d.remove();b.moveToBookmark(n)}else n?b.moveToPosition(d,POLARIS.POSITION_BEFORE_START):g?b.moveToPosition(d,POLARIS.POSITION_AFTER_END):(b.splitElement(d),b.moveToPosition(d,
POLARIS.POSITION_AFTER_END),G(b,c.elements.slice(),d));e.getSelection().selectRanges([b])}}function G(a,b,c){var d=b.pop();if(d){if(c)return G(a,b,d.equals(c)?null:c);c=d.clone();a.insertNode(c);a.moveToPosition(c,POLARIS.POSITION_AFTER_START);G(a,b)}}function A(a){0==a.getContentElement("advanced","borderTop").getValue()&&0==a.getContentElement("advanced","borderBottom").getValue()&&0==a.getContentElement("advanced","borderLeft").getValue()&&0==a.getContentElement("advanced","borderRight").getValue()&&
a.getContentElement("advanced","selBorderStyle").setValue("none")}function B(a){"none"==a.getContentElement("advanced","selBorderStyle").getValue()&&a.getContentElement("advanced","selBorderStyle").setValue("solid")}var m=e.lang.font,H=e.plugins.uicolor,h=[];h.bold=new POLARIS.style(POLARIS.tools.extend({ignoreReadonly:1},POLARIS.config.coreStyles_bold,!0));h.bold.type=POLARIS.STYLE_INLINE;h.italic=new POLARIS.style(POLARIS.tools.extend({ignoreReadonly:1},POLARIS.config.coreStyles_italic,!0));h.italic.type=
POLARIS.STYLE_INLINE;h.underline=new POLARIS.style(POLARIS.tools.extend({ignoreReadonly:1},POLARIS.config.coreStyles_underline,!0));h.underline.type=POLARIS.STYLE_INLINE;h.strike=new POLARIS.style(POLARIS.tools.extend({ignoreReadonly:1},POLARIS.config.coreStyles_strike,!0));h.strike.type=POLARIS.STYLE_INLINE;h.subscript=new POLARIS.style(POLARIS.tools.extend({ignoreReadonly:1},POLARIS.config.coreStyles_subscript,!0));h.subscript.type=POLARIS.STYLE_INLINE;h.superscript=new POLARIS.style(POLARIS.tools.extend({ignoreReadonly:1},
POLARIS.config.coreStyles_superscript,!0));h.superscript.type=POLARIS.STYLE_INLINE;var v=[],r={},p=[];p.push("\x3cspan\x3e"+m.properties+'\x3c/span\x3e\x3cul class\x3d"polaris_dialog_property_buttons"\x3e');u("bold",e.lang.basicstyles.bold,p);u("italic",e.lang.basicstyles.italic,p);u("strike",e.lang.basicstyles.strike,p);u("underline",e.lang.basicstyles.underline,p);u("superscript",e.lang.basicstyles.superscript,p,function(){var a=q(),b=new POLARIS.dom.range(a.getDocument());b.selectNodeContents(a);
this.getState()==POLARIS.TRISTATE_ON?(h.superscript.removeFromRange(b),this.setState(POLARIS.TRISTATE_OFF)):(h.superscript.applyToRange(b),this.setState(POLARIS.TRISTATE_ON),h.subscript.removeFromRange(b),r.subscript.setState(POLARIS.TRISTATE_OFF))});u("subscript",e.lang.basicstyles.subscript,p,function(){var a=q(),b=new POLARIS.dom.range(a.getDocument());b.selectNodeContents(a);this.getState()==POLARIS.TRISTATE_ON?(h.subscript.removeFromRange(b),this.setState(POLARIS.TRISTATE_OFF)):(h.subscript.applyToRange(b),
this.setState(POLARIS.TRISTATE_ON),h.superscript.removeFromRange(b),r.superscript.setState(POLARIS.TRISTATE_OFF))});u("RemoveFormat",m.removeStyle,p,function(){if(v){for(var a=0;a<v.length;a++){var b=v[a];b.getState()==POLARIS.TRISTATE_ON&&b.click()}this.setState(POLARIS.TRISTATE_OFF)}});p.push("\x3c/ul\x3e\x3c/span\x3e");var x=function(a){return POLARIS.tools.getNextId()+"_"+a},y=x("textPreviewFrame"),F=x("textPreviewPanel"),C=x("fontColorPanel"),D=x("bgColorPanel"),E=x("borderColorPanel"),t=J(e,
"family",e.config.font_names,e.config.font_style),I=J(e,"fontsize",e.config.fontSize_sizes,{element:"span",styles:{"font-size":"#(fontsize)"},overrides:[{element:"font",attributes:{size:null}}]}),k=[],l=[];return{title:m.label,minWidth:250,minHeight:36,resizable:POLARIS.DIALOG_RESIZE_NONE,contents:[{id:"info",label:e.lang.common.generalTab,elements:[{type:"hbox",widths:["50%","50%"],children:[{type:"select",id:"fontFamily",label:m.fontFamily,items:[],setup:function(a){this.clear();for(var b in t)this.add(b);
if(a){a=(new POLARIS.dom.elementPath(a)).elements;for(var c=0,d;c<a.length;c++)for(b in d=a[c],t)if(t[b].checkElementMatch(d,!0,e)){this.setValue(b);k.family=t[b];return}}this.setValue(e.config.documentFontFamily)},onChange:function(){var a=q(),b=new POLARIS.dom.range(a.getDocument());b.selectNodeContents(a);l.family&&l.family.removeFromRange(b);t[this.getValue()].applyToRange(b);l.family=t[this.getValue()]},commit:function(a){k.family&&(a=e.getSelection().getRanges()[0],e.focus(),a.collapsed?z(k.family,
a):k.family.remove(e));if(l.family){e.focus();var b=this.getValue();(a=POLARIS.plugins.tabletools.getSelectedCells(e.getSelection()))&&POLARIS.plugins.tabletools.hasSelectedCell(a)?a.forEach(function(a){var d=new POLARIS.dom.range(e.document);d.selectNodeContents(a);t[b].applyToRange(d)}):t[b].apply(e)}}},{type:"html",id:"fontSize",html:"",setup:function(a){this.getDialog();var b="polaris_"+POLARIS.tools.getNextId()+"_textInput",c="polaris_"+POLARIS.tools.getNextId()+"_selectBox",d='\x3cdiv\x3e\x3clabel class\x3d"polaris_dialog_ui_labeled_label" \x3e'+
m.fontSize.panelTitle+'\x3c/label\x3e\x3cdiv class\x3d"polaris_dialog_ui_labeled_content" \x3e\x3cdiv class\x3d"polaris_dialog_ui_editable_select_box" \x3e\x3cselect class\x3d"polaris_dialog_ui_editable_select" id\x3d"'+c+'"\x3e\x3c/select\x3e\x3cinput type\x3d"text" class\x3d"polaris_dialog_ui_editable_input" id\x3d"'+b+'" onclick\x3d"this.select()" \x3e\x3c/div\x3e\x3c/div\x3e\x3c/div\x3e';this.getElement().setHtml(d);var n=document.getElementById(b),g=document.getElementById(c);this.getInputElement=
function(){return n};this.getSelectBoxElement=function(){return g};this.getValue=function(){return n.value};b=function(a){var b=q(),c=new POLARIS.dom.range(b.getDocument());c.selectNodeContents(b);l.fontsize&&l.fontsize.removeFromRange(c);a=a.getFontSizeStyle(a.getValue());a.applyToRange(c);l.fontsize=a};this.getFontSizeStyle=function(a){var b=I[a];b||(a={size:a+"pt"},b=new POLARIS.style(POLARIS.tools.extend({ignoreReadonly:1},POLARIS.config.fontSize_style,!0),a));return b};for(var f in I)c=document.createElement("option"),
c.text=f,g.add(c);if(a)for(a=(new POLARIS.dom.elementPath(a)).elements,c=0;c<a.length;c++){d=a[c];for(f in I)if(this.getFontSizeStyle(f).checkElementMatch(d,!0,e)){n.value=f;k.fontsize=this.getFontSizeStyle(f);b(this);return}if((d=d.getStyle("font-size"))&&0<d.length){f=d.replace(/[0-9|.|-]/g,"");"pt"==f&&(d=d.replace(f,""));n.value=d;k.fontsize=this.getFontSizeStyle(d);b(this);return}}b(this);n.value=e.config.documentFontSize},onKeydown:function(a){var b=a.data.$.keyCode;if(47<b&&58>b||95<b&&106>
b||35==b||36==b||37==b||39==b||8==b||46==b)return!0;a.data.preventDefault();return!1},onChange:function(a){a=a.data.$;a=a.target?a.target:a.path[0];var b=this.getInputElement(),c=q(),d=new POLARIS.dom.range(c.getDocument());d.selectNodeContents(c);l.fontsize&&l.fontsize.removeFromRange(d);c=this.getFontSizeStyle(a.value);c.applyToRange(d);l.fontsize=c;b.value=a.value},commit:function(a){k.fontsize&&(a=e.getSelection().getRanges()[0],e.focus(),a.collapsed?z(k.fontsize,a):k.fontsize.remove(e));if(l.fontsize){e.focus();
var b=this.getFontSizeStyle(this.getValue());a=parseInt(this.getValue());if(100<a||8>a)100<a?this.getInputElement().value="72":this.getInputElement().value="8",b=this.getFontSizeStyle(this.getValue()),a="\x3ctable\x3e\x3cthead\x3e\x3ctr\x3e",a+="\x3cth colspan\x3d3\x3e글꼴의 크기는 8이상 100이하이어야 합니다.\x3cbr\x3e\x3cbr\x3e\x3c/th\x3e",a+="\x3c/tr\x3e",a+="\x3c/thead\x3e",a+="\x3c/table\x3e",(new POLARIS.plugins.notification(e,{message:a,type:"info",duration:3E3,width:300,valign:"top",align:"center"})).show();
(a=POLARIS.plugins.tabletools.getSelectedCells(e.getSelection()))&&POLARIS.plugins.tabletools.hasSelectedCell(a)?a.forEach(function(a){var d=new POLARIS.dom.range(e.document);d.selectNodeContents(a);b.applyToRange(d)}):b.apply(e)}}}]},{type:"html",html:p.join("")},{type:"hbox",widths:["50%","50%"],children:[{type:"hbox",widths:["70%","30%"],children:[{type:"html",id:"fontColor",html:"\x3cspan\x3e"+m.fontColor+'\x3c/span\x3e\x3cdiv id\x3d"'+C+'"class\x3d"polaris_dialog_ui_colorpanel" style\x3d"width:78px;"\x3e\x3c/div\x3e',
setup:function(a){if(a){a=(new POLARIS.dom.elementPath(a)).elements;for(var b=0,c;b<a.length;b++)if((c=a[b])&&"span"==c.getName()&&c.getStyle("color")){var d=POLARIS.document.getById(C);if(d){d.setStyle("background-color",c.getStyle("color"));this.setValue(c.getStyle("color"));this.getDialog().getContentElement("info","fontColor").onChange();k.color=l.color;return}}d=POLARIS.document.getById(C);d.setStyle("background-color","#000000")}},onChange:function(){var a=q(),b=new POLARIS.dom.range(a.getDocument());
b.selectNodeContents(a);l.color&&l.color.removeFromRange(b);if(a=this.getValue())a={element:"span",styles:{color:a.toLowerCase()}},a=new POLARIS.style(POLARIS.tools.extend({ignoreReadonly:1,childRule:function(a){return 0}},a,!0)),a.type=POLARIS.STYLE_INLINE,a.applyToRange(b),l.color=a},commit:function(a){if(l.color&&(k.color&&(a=e.getSelection().getRanges()[0],e.focus(),a.collapsed?z(k.color,a):k.color.remove(e)),a=this.getValue())){a={element:"span",styles:{color:a.toLowerCase()}};var b=new POLARIS.style(POLARIS.tools.extend({ignoreReadonly:1,
childRule:function(a){return!(a.is("a")||a.getElementsByTag("a").count())||w(a)}},a,!0));b.type=POLARIS.STYLE_INLINE;e.focus();l.fontsize&&(e.focus(),(a=POLARIS.plugins.tabletools.getSelectedCells(e.getSelection()))&&POLARIS.plugins.tabletools.hasSelectedCell(a)?a.forEach(function(a){var d=new POLARIS.dom.range(e.document);d.selectNodeContents(a);b.applyToRange(d)}):b.apply(e))}}},H?{type:"button",id:"fontColorChoose","class":"colorChooser",label:e.lang.common.chooseColor,onLoad:function(){this.getElement().getParent().setStyle("vertical-align",
"bottom")},onClick:function(){e.getUIColorFromDialog(function(a){POLARIS.document.getById(C).setStyle("background-color",a?a:"#000000");this.getDialog().getContentElement("info","fontColor").setValue(a);this.getDialog().getContentElement("info","fontColor").onChange()},this)}}:spacer]},{type:"hbox",widths:["70%","30%"],children:[{type:"html",id:"bgColor",html:"\x3cspan\x3e"+m.fontBgColor+'\x3c/span\x3e\x3cdiv id\x3d"'+D+'"class\x3d"polaris_dialog_ui_colorpanel" style\x3d"width:78px;"\x3e\x3c/div\x3e',
setup:function(a){if(a){a=(new POLARIS.dom.elementPath(a)).elements;for(var b=0,c;b<a.length;b++)if((c=a[b])&&"span"==c.getName()&&c.getStyle("background-color")){var d=POLARIS.document.getById(D);if(d){d.setStyle("background-color",c.getStyle("background-color"));this.setValue(c.getComputedStyle("background-color"));this.getDialog().getContentElement("info","bgColor").onChange();k.bgcolor=l.bgcolor;return}}d=POLARIS.document.getById(D);d.setStyle("background-color","#ffffff")}},onChange:function(){var a=
q(),b=new POLARIS.dom.range(a.getDocument());b.selectNodeContents(a);l.bgcolor&&l.bgcolor.removeFromRange(b);if(a=this.getValue())a={element:"span",styles:{"background-color":a.toLowerCase()}},a=new POLARIS.style(POLARIS.tools.extend({ignoreReadonly:1,childRule:function(a){return 0}},a,!0)),a.type=POLARIS.STYLE_INLINE,a.applyToRange(b),l.bgcolor=a},commit:function(a){if(l.bgcolor&&(k.bgcolor&&(a=e.getSelection().getRanges()[0],e.focus(),a.collapsed?z(k.bgcolor,a):k.bgcolor.remove(e)),a=this.getValue())){a=
{element:"span",styles:{"background-color":a.toLowerCase()}};var b=new POLARIS.style(POLARIS.tools.extend({ignoreReadonly:1,childRule:function(a){return w(a)}},a,!0));b.type=POLARIS.STYLE_INLINE;e.focus();(a=POLARIS.plugins.tabletools.getSelectedCells(e.getSelection()))&&POLARIS.plugins.tabletools.hasSelectedCell(a)?a.forEach(function(a){var d=new POLARIS.dom.range(e.document);d.selectNodeContents(a);b.applyToRange(d)}):b.apply(e)}}},H?{type:"button",id:"bgColorChoose","class":"colorChooser",label:e.lang.common.chooseColor,
width:"100%",onLoad:function(){this.getElement().getParent().setStyle("vertical-align","bottom")},onClick:function(){e.getUIColorFromDialog(function(a){POLARIS.document.getById(D).setStyle("background-color",a);this.getDialog().getContentElement("info","bgColor").setValue(a);this.getDialog().getContentElement("info","bgColor").onChange()},this)}}:spacer]}]},{type:"html",html:"\x3cspan\x3e"+m.preview+'\x3c/span\x3e\x3ciframe id\x3d"'+y+'" marginheight\x3d"0px" marginwidth\x3d"0px" scrolling\x3d"no" style\x3d"border: 1px solid #a0a2ab;width:100%;height:70px;display:block;"\x3e\x3c/iframe\x3e'}]},
{id:"advanced",label:e.lang.common.advancedTab,elements:[{type:"vbox",children:[{type:"hbox",widths:["50%","50%"],children:[{type:"text",id:"txtBorderWidth",maxLength:2,"default":"1",label:m.borderWidth,validate:function(a,b,c){return function(){var d=this.getValue().trim(),d=!!(POLARIS.dialog.validate.integer()(d)&&d>=b&&d<c+1);d||(alert(a),this.select());return d}}(m.invalidBorder,0,10),setup:function(a){},onChange:function(){var a=this.getDialog().getContentElement("advanced","borderTop").getValue(),
b=this.getDialog().getContentElement("advanced","borderBottom").getValue(),c=this.getDialog().getContentElement("advanced","borderLeft").getValue(),d=this.getDialog().getContentElement("advanced","borderRight").getValue(),e=this.getDialog().getContentElement("advanced","txtBorderWidth").getValue(),e=POLARIS.tools.cssLength(e),g=POLARIS.document.getById("polaris_font_border_preview");1==a&&g.setStyle("border-top-width",e);1==b&&g.setStyle("border-bottom-width",e);1==c&&g.setStyle("border-left-width",
e);1==d&&g.setStyle("border-right-width",e)},commit:function(a){}},{id:"selBorderStyle",type:"select","default":"solid",label:m.borderStyle,items:[[m.borderStyles.border_none,"none"],[m.borderStyles.border_solid,"solid"],[m.borderStyles.border_double,"double"],[m.borderStyles.border_dashed,"dashed"],[m.borderStyles.border_dotted,"dotted"]],validate:function(){if(k.border){var a=e.getSelection().getRanges()[0];if(!a||a.collapsed)return alert(m.changingStyleNeedSelection),!1}},setup:function(a){},onChange:function(){var a=
this.getDialog().getContentElement("advanced","borderTop").getValue(),b=this.getDialog().getContentElement("advanced","borderBottom").getValue(),c=this.getDialog().getContentElement("advanced","borderLeft").getValue(),d=this.getDialog().getContentElement("advanced","borderRight").getValue(),e=this.getDialog().getContentElement("advanced","selBorderStyle").getValue(),g=POLARIS.document.getById("polaris_font_border_preview");1==a&&g.setStyle("border-top-style",e);1==b&&g.setStyle("border-bottom-style",
e);1==c&&g.setStyle("border-left-style",e);1==d&&g.setStyle("border-right-style",e);"none"==this.getValue()&&(this.getDialog().getContentElement("advanced","borderTop").setValue(!1),this.getDialog().getContentElement("advanced","borderBottom").setValue(!1),this.getDialog().getContentElement("advanced","borderLeft").setValue(!1),this.getDialog().getContentElement("advanced","borderRight").setValue(!1))},commit:function(a){}}]},{type:"hbox",widths:["50%","50%"],children:[{type:"hbox",widths:["70%",
"30%"],children:[{type:"html",id:"txtBorderColor",html:"\x3cspan\x3e"+m.borderColor+'\x3c/span\x3e\x3cdiv id\x3d"'+E+'"class\x3d"polaris_dialog_ui_colorpanel" style\x3d"width: 78px; background-color: #000000"\x3e\x3c/div\x3e',setup:function(a){},onChange:function(){var a=this.getDialog().getContentElement("advanced","borderTop").getValue(),b=this.getDialog().getContentElement("advanced","borderBottom").getValue(),c=this.getDialog().getContentElement("advanced","borderLeft").getValue(),d=this.getDialog().getContentElement("advanced",
"borderRight").getValue(),e=this.getDialog().getContentElement("advanced","txtBorderColor").getValue(),g=POLARIS.document.getById("polaris_font_border_preview");1==a&&g.setStyle("border-top-color",e);1==b&&g.setStyle("border-bottom-color",e);1==c&&g.setStyle("border-left-color",e);1==d&&g.setStyle("border-right-color",e)},commit:function(a){}},H?{type:"button",id:"borderColorChoose","class":"colorChooser",label:e.lang.common.chooseColor,width:"100%",onLoad:function(){this.getElement().getParent().setStyle("vertical-align",
"bottom")},onClick:function(){e.getUIColorFromDialog(function(a){a&&(POLARIS.document.getById(E).setStyle("background-color",a),this.getDialog().getContentElement("advanced","txtBorderColor").setValue(a),this.getDialog().getContentElement("advanced","txtBorderColor").onChange())},this)}}:spacer]},{type:"hbox",widths:["70%","30%"],children:[{type:"html",html:""}]}]},{type:"vbox",children:[{type:"html",html:"\x3cp\x3e"+m.borderSelection+"\x3c/p\x3e"},{type:"vbox",style:"border: 1px solid #a0a2ab; border-radius: 2px; background-color: #fffeff; padding: 5px; height: 100%;",
textalign:"center",children:[{type:"html",html:'\x3cp style\x3d"text-align:center; vertical-align: middle;"\x3e'+m.borderSelectionInfo+"\x3c/p\x3e"},{type:"checkbox",id:"borderTop","default":!1,label:"",onClick:function(){var a=POLARIS.document.getById("polaris_font_border_preview");if(1==this.getValue()){var b=this.getDialog().getContentElement("advanced","txtBorderColor").getValue(),c=this.getDialog().getContentElement("advanced","selBorderStyle").getValue(),d=this.getDialog().getContentElement("advanced",
"txtBorderWidth").getValue(),d=POLARIS.tools.cssLength(d);a.setStyle("border-top-color",b);a.setStyle("border-top-style",c);a.setStyle("border-top-width",d);B(this.getDialog())}else a.removeStyle("border-top"),A(this.getDialog())},commit:function(a){}},{type:"hbox",verticalalign:"middle",widths:["50%","32px","50%"],children:[{type:"checkbox",id:"borderLeft",style:"float:right;","default":!1,label:"",onClick:function(){var a=POLARIS.document.getById("polaris_font_border_preview");if(1==this.getValue()){var b=
this.getDialog().getContentElement("advanced","txtBorderColor").getValue(),c=this.getDialog().getContentElement("advanced","selBorderStyle").getValue(),d=this.getDialog().getContentElement("advanced","txtBorderWidth").getValue(),d=POLARIS.tools.cssLength(d);a.setStyle("border-left-color",b);a.setStyle("border-left-style",c);a.setStyle("border-left-width",d);B(this.getDialog())}else a.removeStyle("border-left"),A(this.getDialog())},commit:function(a){}},{id:"borderPreview",type:"html",html:'\x3cdiv id\x3d"polaris_font_border_preview" style\x3d"width: 32px; height: 32px;"\x3e\x3c/div\x3e',
setup:function(a){var b=POLARIS.document.getById("polaris_font_border_preview"),c=a.getStyle("border-top-color");""!=c?b.setStyle("border-top-color",c):b.setStyle("border-top-color","transparent");c=a.getStyle("border-top-style");""!=c?b.setStyle("border-top-style",c):b.removeStyle("border-top-style");c=a.getStyle("border-top-width");""!=c?b.setStyle("border-top-width",c):b.removeStyle("border-top-width");c=a.getStyle("border-bottom-color");""!=c?b.setStyle("border-bottom-color",c):b.setStyle("border-bottom-color",
"transparent");c=a.getStyle("border-bottom-style");""!=c?b.setStyle("border-bottom-style",c):b.removeStyle("border-bottom-style");c=a.getStyle("border-bottom-width");""!=c?b.setStyle("border-bottom-width",c):b.removeStyle("border-bottom-width");c=a.getStyle("border-left-color");""!=c?b.setStyle("border-left-color",c):b.setStyle("border-left-color","transparent");c=a.getStyle("border-left-style");""!=c?b.setStyle("border-left-style",c):b.removeStyle("border-left-style");c=a.getStyle("border-left-width");
""!=c?b.setStyle("border-left-width",c):b.removeStyle("border-left-width");c=a.getStyle("border-right-color");""!=c?b.setStyle("border-right-color",c):b.setStyle("border-right-color","transparent");c=a.getStyle("border-right-style");""!=c?b.setStyle("border-right-style",c):b.removeStyle("border-right-style");a=a.getStyle("border-right-width");""!=a?b.setStyle("border-right-width",a):b.removeStyle("border-right-width");b.removeAttribute("border")}},{type:"checkbox",id:"borderRight",style:"float:left;",
"default":!1,label:"",onClick:function(){var a=POLARIS.document.getById("polaris_font_border_preview");if(1==this.getValue()){var b=this.getDialog().getContentElement("advanced","txtBorderColor").getValue(),c=this.getDialog().getContentElement("advanced","selBorderStyle").getValue(),d=this.getDialog().getContentElement("advanced","txtBorderWidth").getValue(),d=POLARIS.tools.cssLength(d);a.setStyle("border-right-color",b);a.setStyle("border-right-style",c);a.setStyle("border-right-width",d);B(this.getDialog())}else a.removeStyle("border-right"),
A(this.getDialog())},commit:function(a){}}]},{type:"checkbox",id:"borderBottom","default":!1,label:"",onClick:function(){var a=POLARIS.document.getById("polaris_font_border_preview");if(1==this.getValue()){var b=this.getDialog().getContentElement("advanced","txtBorderColor").getValue(),c=this.getDialog().getContentElement("advanced","selBorderStyle").getValue(),d=this.getDialog().getContentElement("advanced","txtBorderWidth").getValue(),d=POLARIS.tools.cssLength(d);a.setStyle("border-bottom-color",
b);a.setStyle("border-bottom-style",c);a.setStyle("border-bottom-width",d);B(this.getDialog())}else a.removeStyle("border-bottom"),A(this.getDialog())},commit:function(a){}}]}]}]}]}],onLoad:function(){var a=POLARIS.document.getById(y);a&&a.getFrameDocument().write('\x3ctable style\x3d"height:100%;width:100%"\x3e\x3ctr\x3e\x3ctd valign\x3d"bottom" style\x3d"overflow:hidden;white-space:nowrap;"\x3e\x3cspan id\x3d"'+F+'"\x3e안녕하세요 hello 123 \x3c/span\x3e\x3c/td\x3e\x3c/tr\x3e\x3c/table\x3e')},onShow:function(){var a=
this.getParentEditor(),b=a.getSelection().getStartElement();if(b){l=[];k=[];var c=POLARIS.document.getById(y);if(c){c=c.getFrameDocument();c.write('\x3cscript\x3evar preventKeydown\x3dfunction(){event.preventDefault();}\x3c/script\x3e\x3ctable style\x3d"height:100%;width:100%"\x3e\x3ctr\x3e\x3ctd valign\x3d"bottom" style\x3d"overflow:hidden;white-space:nowrap;"\x3e\x3cspan id\x3d"'+F+'"\x3e안녕하세요 hello 123 \x3c/span\x3e\x3c/td\x3e\x3c/tr\x3e\x3c/table\x3e');var d=c.getBody();d.$&&d.$.setAttribute("onkeydown",
"preventKeydown()");c.appendStyleSheet(POLARIS.getUrl("fonts/fonts.css"))}this.setupContent(b);if(b&&r){for(var c=new POLARIS.dom.elementPath(b),d=c.elements,c=[],e=0,g;e<d.length;e++)g=d[e],h.bold.checkElementMatch(g,!0,a)?c.bold=!0:h.italic.checkElementMatch(g,!0,a)?c.italic=!0:h.underline.checkElementMatch(g,!0,a)?c.underline=!0:h.strike.checkElementMatch(g,!0,a)?c.strike=!0:h.subscript.checkElementMatch(g,!0,a)?c.subscript=!0:h.superscript.checkElementMatch(g,!0,a)&&(c.superscript=!0);a=q();d=
new POLARIS.dom.range(a.getDocument());d.selectNodeContents(a);for(var f in r)c[f]?(h[f]&&h[f].applyToRange(d),r[f]&&r[f].setState(POLARIS.TRISTATE_ON),k[f]=h[f]):r[f]&&r[f].setState(POLARIS.TRISTATE_OFF)}c=new POLARIS.dom.elementPath(b);d=c.elements;for(e=0;e<d.length;e++)if((b=d[e])&&"span"==b.getName()&&(b.getStyle("border")||b.getStyle("border-width")||b.getStyle("border-style")||b.getStyle("border-color"))){if(f=POLARIS.document.getById("polaris_font_border_preview"))f.setStyle("border-width",
b.getStyle("border-width")),f.setStyle("border-style",b.getStyle("border-style")),f.setStyle("border-color",b.getStyle("border-color")),a=b.getComputedStyle("border-left-style"),c=b.getComputedStyle("border-top-style"),d=b.getComputedStyle("border-right-style"),f=b.getComputedStyle("border-bottom-style"),a="none"==a||""==a?!1:!0,this.getContentElement("advanced","borderLeft").setValue(a),c="none"==c||""==c?!1:!0,this.getContentElement("advanced","borderTop").setValue(c),d="none"==d||""==d?!1:!0,this.getContentElement("advanced",
"borderRight").setValue(d),e="none"==f||""==f?!1:!0,this.getContentElement("advanced","borderBottom").setValue(e),f=POLARIS.document.getById(E),a?(a=b.getStyle("border-left-style"),a="none"==a||""==a?!1:a,this.getContentElement("advanced","selBorderStyle").setValue(a),a=parseInt(b.getStyle("border-left-width")),this.getContentElement("advanced","txtBorderWidth").setValue(a),a=b.getStyle("border-left-color"),a="transparent"==a||"rgba(0, 0, 0, 0)"==a||""==a?!1:a,this.getContentElement("advanced","txtBorderColor").setValue(a),
f.setStyle("background-color",a)):c?(a=b.getStyle("border-top-style"),a="none"==a||""==a?!1:a,this.getContentElement("advanced","selBorderStyle").setValue(a),a=parseInt(b.getStyle("border-top-width")),this.getContentElement("advanced","txtBorderWidth").setValue(a),a=b.getStyle("border-top-color"),a="transparent"==a||"rgba(0, 0, 0, 0)"==a||""==a?!1:a,this.getContentElement("advanced","txtBorderColor").setValue(a),f.setStyle("background-color",a)):d?(a=b.getStyle("border-right-style"),a="none"==a||
""==a?!1:a,this.getContentElement("advanced","selBorderStyle").setValue(a),a=parseInt(b.getStyle("border-right-width")),this.getContentElement("advanced","txtBorderWidth").setValue(a),a=b.getStyle("border-right-color"),a="transparent"==a||"rgba(0, 0, 0, 0)"==a||""==a?!1:a,this.getContentElement("advanced","txtBorderColor").setValue(a),f.setStyle("background-color",a)):e?(a=b.getStyle("border-bottom-style"),a="none"==a||""==a?!1:a,this.getContentElement("advanced","selBorderStyle").setValue(a),a=parseInt(b.getStyle("border-bottom-width")),
this.getContentElement("advanced","txtBorderWidth").setValue(a),a=b.getStyle("border-bottom-color"),a="transparent"==a||"rgba(0, 0, 0, 0)"==a||""==a?!1:a,this.getContentElement("advanced","txtBorderColor").setValue(a),f.setStyle("background-color",a)):(this.getContentElement("advanced","selBorderStyle").setValue("solid"),this.getContentElement("advanced","txtBorderWidth").setValue("1"),this.getContentElement("advanced","txtBorderColor").setValue("rgba(0, 0, 0, 0)"),f.setStyle("background-color","rgba(0, 0, 0, 0)"));
f={element:"span",styles:{border:b.getComputedStyle("border")}};f=new POLARIS.style(POLARIS.tools.extend({ignoreReadonly:1,childRule:function(a){return w(a)}},f,!0));f.type=POLARIS.STYLE_INLINE;k.border=f;b={element:"span",styles:{"border-width":b.getComputedStyle("border-width"),"border-style":b.getComputedStyle("border-style"),"border-color":b.getComputedStyle("border-color")}};b=new POLARIS.style(POLARIS.tools.extend({ignoreReadonly:1,childRule:function(a){return w(a)}},b,!0));b.type=POLARIS.STYLE_INLINE;
k.border_wsc=b;return}this.getContentElement("advanced","txtBorderColor").setValue("#000000");f=POLARIS.document.getById(E);f.setStyle("background-color","#000000")}else this.hide()},onOk:function(){var a=this.getParentEditor();a.fire("saveSnapshot");this.commitContent(null);var b=POLARIS.plugins.tabletools.getSelectedCells(a.getSelection());v&&v.forEach(function(c){var e,g;e=c.getState();(g=h[c.name])&&(b&&POLARIS.plugins.tabletools.hasSelectedCell(b)?b.forEach(function(b){var c=new POLARIS.dom.range(a.document);
c.selectNodeContents(b);e===POLARIS.TRISTATE_ON?g.applyToRange(c):g.removeFromRange(c)}):e===POLARIS.TRISTATE_ON?g.apply(a):g.remove(a))});k.border&&k.border.remove(a);k.border_wsc&&k.border_wsc.remove(a);if("none"!=this.getContentElement("advanced","selBorderStyle").getValue()){var c=POLARIS.document.getById("polaris_font_border_preview");c&&(this.getContentElement("advanced","borderLeft").getValue()||this.getContentElement("advanced","borderTop").getValue()||this.getContentElement("advanced","borderRight").getValue()||
this.getContentElement("advanced","borderBottom").getValue())&&(c={element:"span",styles:{"border-width":c.getComputedStyle("border-width"),"border-style":c.getComputedStyle("border-style"),"border-color":c.getComputedStyle("border-color")}},c=new POLARIS.style(POLARIS.tools.extend({ignoreReadonly:1,childRule:function(a){return w(a)}},c,!0)),c.type=POLARIS.STYLE_INLINE,a.focus(),c.apply(a))}a.fire("saveSnapshot")}}})})();