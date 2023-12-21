﻿(function(){POLARIS.dialog.add("paragraphform",function(l){function z(a,c,g,b){l.ui.addButton(a,{label:c,toolbar:"dialog_property_button",click:b?b:function(){var c=t(),b=new POLARIS.dom.range(c.getDocument());b.selectNodeContents(c);x&&(x.setState(POLARIS.TRISTATE_OFF),r[x.name].removeFromRange(b));this.setState(POLARIS.TRISTATE_ON);r[a].applyToRange(b);x=this}});if(c=l.ui.create(a))g.push('\x3cli class\x3d"polaris_dialog_property_button"\x3e'),c.className=c.className?c.className+" polaris_dialog_button":
"polaris_dialog_button",c.render(l,g),g.push("\x3c/li\x3e");y.push(c);v[a]=c}function t(){var a=POLARIS.document.getById(B);if(a)return a.getFrameDocument().getById(E)}function F(a,c,b){return function(){var d=this.getValue().trim(),d=!!(d>=c&&d<b+1);d||(alert(a),this.select());return d}}function C(a){0==a.getContentElement("advanced","borderTop").getValue()&&0==a.getContentElement("advanced","borderBottom").getValue()&&0==a.getContentElement("advanced","borderLeft").getValue()&&0==a.getContentElement("advanced",
"borderRight").getValue()&&a.getContentElement("advanced","selBorderStyle").setValue("none")}function D(a){"none"==a.getContentElement("advanced","selBorderStyle").getValue()&&a.getContentElement("advanced","selBorderStyle").setValue("solid")}var b=l.lang.justify,H=l.plugins.uicolor,r=[];r.justifyleft=new POLARIS.style(POLARIS.tools.extend({ignoreReadonly:1},{element:"strong",styles:{"text-align":"left",display:"block"}},!0));r.justifyleft.type=POLARIS.STYLE_INLINE;r.justifycenter=new POLARIS.style(POLARIS.tools.extend({ignoreReadonly:1},
{element:"strong",styles:{"text-align":"center",display:"block"}},!0));r.justifycenter.type=POLARIS.STYLE_INLINE;r.justifyright=new POLARIS.style(POLARIS.tools.extend({ignoreReadonly:1},{element:"strong",styles:{"text-align":"right",display:"block"}},!0));r.justifyright.type=POLARIS.STYLE_INLINE;r.justifyblock=new POLARIS.style(POLARIS.tools.extend({ignoreReadonly:1},{element:"strong",styles:{"text-align":"justify",display:"block"}},!0));r.justifyblock.type=POLARIS.STYLE_INLINE;var y=[],v=[],x,u=
[];u.push("\x3cspan\x3e"+b.paragraph.align+'\x3c/span\x3e\x3cul class\x3d"polaris_dialog_property_buttons"\x3e');z("justifyleft",b.left,u);z("justifycenter",b.center,u);z("justifyright",b.right,u);z("justifyblock",b.block,u);u.push("\x3c/ul\x3e\x3c/span\x3e");var w=function(a){return POLARIS.tools.getNextId()+"_"+a},B=w("textPreviewFrame"),E=w("textPreviewPanel");w("fontColorPanel");var A=w("bgColorPanel"),G=w("borderColorPanel");return{title:b.paragraph.title,minWidth:250,minHeight:36,resizable:POLARIS.DIALOG_RESIZE_NONE,
contents:[{id:"info",label:l.lang.common.generalTab,elements:[{type:"html",html:u.join("")},{type:"hbox",widths:["50%","50%"],children:[{type:"hbox",widths:["80%","20%"],children:[{type:"text",id:"txtTopMargin",maxLength:4,label:b.paragraph.topMargin,validate:F(b.paragraph.invalidTopMargin,0,100),"default":"0",onKeyUp:function(){t().setStyle("margin-top",this.getValue()+b.verticalUnit)},onChange:function(){t().setStyle("margin-top",this.getValue()+b.verticalUnit)}},{type:"vbox",children:[{type:"html",
html:"\x26nbsp;"},{type:"html",html:b.verticalUnit}]}]},{type:"hbox",widths:["80%","20%"],children:[{type:"text",id:"txtBottomMargin",maxLength:4,label:b.paragraph.bottomMargin,validate:F(b.paragraph.invalidBottomMargin,0,100),"default":"0",onKeyUp:function(){t().setStyle("margin-bottom",this.getValue()+b.verticalUnit)},onChange:function(){t().setStyle("margin-bottom",this.getValue()+b.verticalUnit)}},{type:"vbox",children:[{type:"html",html:"\x26nbsp;"},{type:"html",html:b.verticalUnit}]}]}]},{type:"hbox",
widths:["50%","50%"],children:[{type:"hbox",widths:["80%","20%"],children:[{type:"text",id:"txtLeftMargin",maxLength:4,label:b.paragraph.leftMargin,validate:function(){var a=this.getValue().trim(),c=-parseFloat(l.plugins.pagination.pageInfo.marginLeft),a=!!(a>=c&&100>=a);a||(alert(b.paragraph.invalidLeftMargin.replace("%1",c)),this.select());return a},"default":"0",onKeyUp:function(){var a=t(),c=this.getDialog(),g=this.getValue(),d=c.getContentElement("info","radioFirstLineIndent"),c=c.getContentElement("info",
"txtIndentValue");d.getValue()==b.paragraph.firstLine.outdent&&(g=parseFloat(g)+parseFloat(c.getValue()));a.setStyle("margin-left",g+b.verticalUnit)},onChange:function(){var a=t(),c=this.getDialog(),g=this.getValue(),d=c.getContentElement("info","radioFirstLineIndent"),c=c.getContentElement("info","txtIndentValue");d.getValue()==b.paragraph.firstLine.outdent&&(g=parseFloat(g)+parseFloat(c.getValue()));a.setStyle("margin-left",g+b.verticalUnit)}},{type:"vbox",children:[{type:"html",html:"\x26nbsp;"},
{type:"html",html:b.verticalUnit}]}]},{type:"hbox",widths:["80%","20%"],children:[{type:"text",id:"txtRightMargin",maxLength:4,label:b.paragraph.rightMargin,validate:function(){var a=this.getValue().trim(),c=-parseFloat(l.plugins.pagination.pageInfo.marginRight),a=!!(a>=c&&100>=a);a||(alert(b.paragraph.invalidRightMargin.replace("%1",c)),this.select());return a},"default":"0",onKeyUp:function(){t().setStyle("margin-right",this.getValue()+b.verticalUnit)},onChange:function(){t().setStyle("margin-right",
this.getValue()+b.verticalUnit)}},{type:"vbox",children:[{type:"html",html:"\x26nbsp;"},{type:"html",html:b.verticalUnit}]}]}]},{type:"radio",id:"radioFirstLineIndent",label:b.paragraph.firstLine.label,items:[[b.paragraph.firstLine.normal,b.paragraph.firstLine.normal],[b.paragraph.firstLine.indent,b.paragraph.firstLine.indent],[b.paragraph.firstLine.outdent,b.paragraph.firstLine.outdent]],"default":b.paragraph.firstLine.normal,onClick:function(){var a=this.getDialog().getContentElement("info","txtIndentValue");
this.getValue()==b.paragraph.firstLine.normal?(a.setValue("0"),a.getInputElement().setAttribute("disabled")):(""!=a.getValue()&&"0"!=a.getValue()||a.setValue("10"),a.getInputElement().removeAttribute("disabled"));a.onChange()},onChange:function(){var a=this.getDialog().getContentElement("info","txtIndentValue");this.getValue()==b.paragraph.firstLine.normal?a.getInputElement().setAttribute("disabled"):a.getInputElement().removeAttribute("disabled")}},{type:"hbox",widths:["90%","10%"],children:[{type:"text",
id:"txtIndentValue",maxLength:4,"default":"10",validate:function(){var a=this.getValue().trim(),a=!!(0<=a&&301>a);if(!a){var c=this.getDialog().getContentElement("info","radioFirstLineIndent").getValue();c==b.paragraph.firstLine.indent?alert(b.invalidTextIndent):c==b.paragraph.firstLine.outdent&&alert(b.invalidTextOutdent);this.select()}return a},onKeyUp:function(){var a=t(),c=this.getDialog(),g=c.getContentElement("info","radioFirstLineIndent").getValue(),c=c.getContentElement("info","txtLeftMargin").getValue(),
d=this.getValue();g==b.paragraph.firstLine.outdent&&(c=parseFloat(c)+parseFloat(d),d="-"+d);a.setStyle("text-indent",d+b.verticalUnit);a.setStyle("margin-left",c+b.verticalUnit)},onChange:function(){var a=t(),c=this.getDialog(),g=c.getContentElement("info","radioFirstLineIndent").getValue(),c=c.getContentElement("info","txtLeftMargin").getValue(),d=this.getValue();g==b.paragraph.firstLine.outdent&&(c=parseFloat(c)+parseFloat(d),d="-"+d);a.setStyle("text-indent",d+b.verticalUnit);a.setStyle("margin-left",
c+b.verticalUnit)}},{type:"html",html:b.verticalUnit}]},{type:"html",html:"\x3cspan\x3e"+b.paragraph.preview+'\x3c/span\x3e\x3ciframe id\x3d"'+B+'" marginheight\x3d"0px" marginwidth\x3d"0px" scrolling\x3d"no" style\x3d"border: 1px solid #a0a2ab;width:100%;height:120px;display:block;"\x3e\x3c/iframe\x3e'}]},{id:"advanced",label:l.lang.common.advancedTab,elements:[{type:"vbox",children:[{type:"hbox",widths:["50%","50%"],children:[{type:"text",id:"txtBorderWidth",maxLength:2,"default":"1",label:b.paragraph.borderWidth,
validate:F(b.paragraph.invalidBorder,0,10),setup:function(a){},onChange:function(a){a=this.getDialog().getContentElement("advanced","borderTop").getValue();var c=this.getDialog().getContentElement("advanced","borderBottom").getValue(),b=this.getDialog().getContentElement("advanced","borderLeft").getValue(),d=this.getDialog().getContentElement("advanced","borderRight").getValue(),h=this.getDialog().getContentElement("advanced","txtBorderWidth").getValue(),h=POLARIS.tools.cssLength(h),m=POLARIS.document.getById("polaris_paragraph_border_preview");
1==a&&m.setStyle("border-top-width",h);1==c&&m.setStyle("border-bottom-width",h);1==b&&m.setStyle("border-left-width",h);1==d&&m.setStyle("border-right-width",h)}},{id:"selBorderStyle",type:"select","default":"solid",label:b.paragraph.borderStyle,items:[[b.paragraph.borderStyles.border_none,"none"],[b.paragraph.borderStyles.border_solid,"solid"],[b.paragraph.borderStyles.border_double,"double"],[b.paragraph.borderStyles.border_dashed,"dashed"],[b.paragraph.borderStyles.border_dotted,"dotted"]],setup:function(a){},
onChange:function(a){a=this.getDialog().getContentElement("advanced","borderTop").getValue();var c=this.getDialog().getContentElement("advanced","borderBottom").getValue(),b=this.getDialog().getContentElement("advanced","borderLeft").getValue(),d=this.getDialog().getContentElement("advanced","borderRight").getValue(),h=this.getDialog().getContentElement("advanced","selBorderStyle").getValue(),m=POLARIS.document.getById("polaris_paragraph_border_preview");1==a&&m.setStyle("border-top-style",h);1==
c&&m.setStyle("border-bottom-style",h);1==b&&m.setStyle("border-left-style",h);1==d&&m.setStyle("border-right-style",h);"none"==this.getValue()&&(this.getDialog().getContentElement("advanced","borderTop").setValue(!1),this.getDialog().getContentElement("advanced","borderBottom").setValue(!1),this.getDialog().getContentElement("advanced","borderLeft").setValue(!1),this.getDialog().getContentElement("advanced","borderRight").setValue(!1))}}]},{type:"hbox",widths:["50%","50%"],children:[{type:"hbox",
widths:["70%","30%"],children:[{type:"html",id:"txtBgColor",html:"\x3cspan\x3e"+b.paragraph.bgColor+'\x3c/span\x3e\x3cdiv id\x3d"'+A+'"class\x3d"polaris_dialog_ui_colorpanel" style\x3d"width: 78px; background-color: #000000"\x3e\x3c/div\x3e',setup:function(a){},onChange:function(a){a=POLARIS.document.getById("polaris_paragraph_border_preview");this.getValue()&&a.setStyle("background-color",this.getValue().toLowerCase())}},H?{type:"button",id:"bgColorChoose","class":"colorChooser",label:l.lang.common.chooseColor,
width:"100%",onLoad:function(){this.getElement().getParent().setStyle("vertical-align","bottom")},onClick:function(){l.getUIColorFromDialog(function(a){this.getDialog().getContentElement("advanced","noBackgroundColor").getValue()||(POLARIS.document.getById(A).setStyle("background-color",a),this.getDialog().getContentElement("advanced","txtBgColor").setValue(a),this.getDialog().getContentElement("advanced","txtBgColor").onChange())},this)}}:spacer]},{type:"hbox",widths:["70%","30%"],children:[{type:"html",
id:"txtBorderColor",html:"\x3cspan\x3e"+b.paragraph.borderColor+'\x3c/span\x3e\x3cdiv id\x3d"'+G+'"class\x3d"polaris_dialog_ui_colorpanel" style\x3d"width: 78px; background-color: #000000"\x3e\x3c/div\x3e',setup:function(a){},onChange:function(a){a=this.getDialog().getContentElement("advanced","borderTop").getValue();var c=this.getDialog().getContentElement("advanced","borderBottom").getValue(),b=this.getDialog().getContentElement("advanced","borderLeft").getValue(),d=this.getDialog().getContentElement("advanced",
"borderRight").getValue(),h=this.getDialog().getContentElement("advanced","txtBorderColor").getValue(),m=POLARIS.document.getById("polaris_paragraph_border_preview");1==a&&m.setStyle("border-top-color",h);1==c&&m.setStyle("border-bottom-color",h);1==b&&m.setStyle("border-left-color",h);1==d&&m.setStyle("border-right-color",h)}},H?{type:"button",id:"borderColorChoose","class":"colorChooser",label:l.lang.common.chooseColor,width:"100%",onLoad:function(){this.getElement().getParent().setStyle("vertical-align",
"bottom")},onClick:function(){l.getUIColorFromDialog(function(a){a&&(POLARIS.document.getById(G).setStyle("background-color",a),this.getDialog().getContentElement("advanced","txtBorderColor").setValue(a),this.getDialog().getContentElement("advanced","txtBorderColor").onChange())},this)}}:spacer]}]},{type:"checkbox",id:"noBackgroundColor","default":!1,label:l.lang.table.noBackgroundColor,onChange:function(){POLARIS.document.getById(A).setStyle("background-color","");POLARIS.document.getById("polaris_paragraph_border_preview").setStyle("background-color",
"")},onClick:function(){POLARIS.document.getById(A).setStyle("background-color","");POLARIS.document.getById("polaris_paragraph_border_preview").setStyle("background-color","")}},{type:"vbox",children:[{type:"html",html:"\x3cp\x3e"+b.paragraph.borderSelection+"\x3c/p\x3e"},{type:"vbox",style:"border: 1px solid #a0a2ab; border-radius: 2px; background-color: #fffeff; padding: 5px; height: 100%;",textalign:"center",children:[{type:"html",html:'\x3cp style\x3d"text-align:center; vertical-align: middle;"\x3e'+
b.paragraph.borderSelectionInfo+"\x3c/p\x3e"},{type:"checkbox",id:"borderTop","default":!1,label:"",onClick:function(){var a=POLARIS.document.getById("polaris_paragraph_border_preview");if(1==this.getValue()){var c=this.getDialog().getContentElement("advanced","txtBorderColor").getValue(),b=this.getDialog().getContentElement("advanced","selBorderStyle").getValue(),d=this.getDialog().getContentElement("advanced","txtBorderWidth").getValue(),d=POLARIS.tools.cssLength(d);a.setStyle("border-top-color",
c);a.setStyle("border-top-style",b);a.setStyle("border-top-width",d);D(this.getDialog())}else a.removeStyle("border-top"),C(this.getDialog())}},{type:"hbox",verticalalign:"middle",widths:["50%","32px","50%"],children:[{type:"checkbox",id:"borderLeft",style:"float:right;","default":!1,label:"",onClick:function(){var a=POLARIS.document.getById("polaris_paragraph_border_preview");if(1==this.getValue()){var c=this.getDialog().getContentElement("advanced","txtBorderColor").getValue(),b=this.getDialog().getContentElement("advanced",
"selBorderStyle").getValue(),d=this.getDialog().getContentElement("advanced","txtBorderWidth").getValue(),d=POLARIS.tools.cssLength(d);a.setStyle("border-left-color",c);a.setStyle("border-left-style",b);a.setStyle("border-left-width",d);D(this.getDialog())}else a.removeStyle("border-left"),C(this.getDialog())}},{id:"borderPreview",type:"html",html:'\x3cdiv id\x3d"polaris_paragraph_border_preview" style\x3d"width: 32px; height: 32px;"\x3e\x3c/div\x3e',setup:function(a){var c=POLARIS.document.getById("polaris_paragraph_border_preview"),
b=a.getStyle("border-top-color");""!=b?c.setStyle("border-top-color",b):c.setStyle("border-top-color","#000000");b=a.getStyle("border-top-style");""!=b?c.setStyle("border-top-style",b):c.setStyle("border-top-style","solid");b=a.getStyle("border-top-width");""!=b?c.setStyle("border-top-width",b):c.setStyle("border-top-width","0px");b=a.getStyle("border-bottom-color");""!=b?c.setStyle("border-bottom-color",b):c.setStyle("border-bottom-color","#000000");b=a.getStyle("border-bottom-style");""!=b?c.setStyle("border-bottom-style",
b):c.setStyle("border-bottom-style","solid");b=a.getStyle("border-bottom-width");""!=b?c.setStyle("border-bottom-width",b):c.setStyle("border-bottom-width","0px");b=a.getStyle("border-left-color");""!=b?c.setStyle("border-left-color",b):c.setStyle("border-left-color","#000000");b=a.getStyle("border-left-style");""!=b?c.setStyle("border-left-style",b):c.setStyle("border-left-style","solid");b=a.getStyle("border-left-width");""!=b?c.setStyle("border-left-width",b):c.setStyle("border-left-width","0px");
b=a.getStyle("border-right-color");""!=b?c.setStyle("border-right-color",b):c.setStyle("border-right-color","#000000");b=a.getStyle("border-right-style");""!=b?c.setStyle("border-right-style",b):c.setStyle("border-right-style","solid");a=a.getStyle("border-right-width");""!=a?c.setStyle("border-right-width",a):c.setStyle("border-right-width","0px");c.removeAttribute("border")}},{type:"checkbox",id:"borderRight",style:"float:left;","default":!1,label:"",onClick:function(){var a=POLARIS.document.getById("polaris_paragraph_border_preview");
if(1==this.getValue()){var b=this.getDialog().getContentElement("advanced","txtBorderColor").getValue(),g=this.getDialog().getContentElement("advanced","selBorderStyle").getValue(),d=this.getDialog().getContentElement("advanced","txtBorderWidth").getValue(),d=POLARIS.tools.cssLength(d);a.setStyle("border-right-color",b);a.setStyle("border-right-style",g);a.setStyle("border-right-width",d);D(this.getDialog())}else a.removeStyle("border-right"),C(this.getDialog())}}]},{type:"checkbox",id:"borderBottom",
"default":!1,label:"",onClick:function(){var a=POLARIS.document.getById("polaris_paragraph_border_preview");if(1==this.getValue()){var b=this.getDialog().getContentElement("advanced","txtBorderColor").getValue(),g=this.getDialog().getContentElement("advanced","selBorderStyle").getValue(),d=this.getDialog().getContentElement("advanced","txtBorderWidth").getValue(),d=POLARIS.tools.cssLength(d);a.setStyle("border-bottom-color",b);a.setStyle("border-bottom-style",g);a.setStyle("border-bottom-width",d);
D(this.getDialog())}else a.removeStyle("border-bottom"),C(this.getDialog())}}]}]}]}]}],onLoad:function(){var a=POLARIS.document.getById(B);a&&a.getFrameDocument().write('\x3ctable style\x3d"height:100%;width:100%"\x3e\x3ctr\x3e\x3ctd valign\x3d"top" style\x3d"font-size:9px;"\x3e\x3cp style\x3d"margin:0px;"\x3e동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세. 무궁화 삼천리 화려강산 대한 사람, 대한으로 길이 보전하세. \x3c/p\x3e\x3cp id\x3d"'+E+'" style\x3d"margin:0px;background-color:#d3d3d3;"\x3e남산 위에 저 소나무, 철갑을 두른 듯 바람서리 불변함은 우리 기상일세. 무궁화 삼천리 화려강산 대한 사람, 대한으로 길이 보전하세.\x3c/p\x3e\x3cp style\x3d"margin:0px;"\x3e가을 하늘 공활한데 높고 구름 없이 밝은 달은 우리 가슴 일편단심일세. 무궁화 삼천리 화려강산 대한 사람, 대한으로 길이 보전하세.\x3c/p\x3e\x3c/td\x3e\x3c/tr\x3e\x3c/table\x3e')},
onShow:function(){var a=this.getParentEditor();if(this.selectedElements=POLARIS.tools.getSelectedParagraph(a)){var c=POLARIS.tools.isInteger,a=this.selectedElements[0],g=POLARIS.tools.convertToUnit(a.getStyle("margin-left"),"mm",2),d=POLARIS.tools.convertToUnit(a.getStyle("margin-right"),"mm",2),h=POLARIS.tools.convertToUnit(a.getStyle("margin-top"),"mm",2),m=POLARIS.tools.convertToUnit(a.getStyle("margin-bottom"),"mm",2),k=parseFloat(g),n=parseFloat(d),p=parseFloat(h),e=parseFloat(m),k=isNaN(k)?
0:k,n=isNaN(n)?0:n,p=isNaN(p)?0:p,e=isNaN(e)?0:e,f=POLARIS.tools.convertToUnit(a.getStyle("text-indent"),"mm",2),q=parseFloat(f),q=isNaN(q)?0:q;this.getContentElement("info","txtIndentValue").setValue(Math.abs(c(q)?q:q.toFixed(1)));var l=this.getContentElement("info","radioFirstLineIndent");0<q?l.setValue(b.paragraph.firstLine.indent):0>q?(l.setValue(b.paragraph.firstLine.outdent),k+=q):l.setValue(b.paragraph.firstLine.normal);var q=this.getContentElement("info","txtLeftMargin"),l=this.getContentElement("info",
"txtRightMargin"),u=this.getContentElement("info","txtTopMargin"),w=this.getContentElement("info","txtBottomMargin");q.setValue(c(k)?k:k.toFixed(1));l.setValue(c(n)?n:n.toFixed(1));u.setValue(c(p)?p:p.toFixed(1));w.setValue(c(e)?e:e.toFixed(1));if(c=POLARIS.document.getById(B))c=c.getFrameDocument(),c.write('\x3cscript\x3evar preventKeydown\x3dfunction(){event.preventDefault();}\x3c/script\x3e\x3ctable style\x3d"height:100%;width:100%"\x3e\x3ctr\x3e\x3ctd valign\x3d"top" style\x3d"font-size:9px;"\x3e\x3cp style\x3d"margin:0px;"\x3e동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세. 무궁화 삼천리 화려강산 대한 사람, 대한으로 길이 보전하세. \x3c/p\x3e\x3cp id\x3d"'+
E+'" style\x3d"margin:0px;background-color:#d3d3d3;"\x3e남산 위에 저 소나무, 철갑을 두른 듯 바람서리 불변함은 우리 기상일세. 무궁화 삼천리 화려강산 대한 사람, 대한으로 길이 보전하세.\x3c/p\x3e\x3cp style\x3d"margin:0px;"\x3e가을 하늘 공활한데 높고 구름 없이 밝은 달은 우리 가슴 일편단심일세. 무궁화 삼천리 화려강산 대한 사람, 대한으로 길이 보전하세.\x3c/p\x3e\x3c/td\x3e\x3c/tr\x3e\x3c/table\x3e'),c=c.getBody(),c.$&&c.$.setAttribute("onkeydown","preventKeydown()");if(y)for(c=0;c<y.length;c++)k=y[c],k.getState()==POLARIS.TRISTATE_ON&&k.setState(POLARIS.TRISTATE_OFF);c=t();a&&a.getStyle&&(k=new POLARIS.dom.range(c.getDocument()),
k.selectNodeContents(c),n=a.getStyle("text-align"),"center"==n?(v.justifycenter.setState(POLARIS.TRISTATE_ON),x=v.justifycenter,r.justifycenter.applyToRange(k)):"right"==n?(v.justifyright.setState(POLARIS.TRISTATE_ON),x=v.justifyright,r.justifyright.applyToRange(k)):"justify"==n?(v.justifyblock.setState(POLARIS.TRISTATE_ON),x=v.justifyblock,r.justifyblock.applyToRange(k)):(v.justifyleft.setState(POLARIS.TRISTATE_ON),x=v.justifyleft,r.justifyleft.applyToRange(k)));c.setStyle("margin-top",h?h:"0mm");
c.setStyle("margin-bottom",m?m:"0mm");c.setStyle("margin-left",g?g:"0mm");c.setStyle("margin-right",d?d:"0mm");c.setStyle("text-indent",f?f:"0mm");this.setupContent(a);g=a.getStyle("border-top-style");d=a.getStyle("border-left-style");h=a.getStyle("border-bottom-style");m=a.getStyle("border-right-style");f=a.getStyle("border-color");c=a.getStyle("background-color");k=parseInt(a.getStyle("border-width"));isNaN(k)&&(k=""!=a.getStyle("border-left-width")?parseInt(a.getStyle("border-left-width")):""!=
a.getStyle("border-top-width")?parseInt(a.getStyle("border-top-width")):""!=a.getStyle("border-right-width")?parseInt(a.getStyle("border-right-width")):""!=a.getStyle("border-bottom-width")?parseInt(a.getStyle("border-bottom-width")):1);10<k&&(k=10);n=a.getStyle("border-style");if(""==n||void 0==n)""!=a.getStyle("border-left-style")?n=a.getStyle("border-left-style"):""!=a.getStyle("border-top-style")?n=a.getStyle("border-top-style"):""!=a.getStyle("border-right-style")?n=a.getStyle("border-right-style"):
""!=a.getStyle("border-bottom-style")&&(n=a.getStyle("border-bottom-style"));if(p=POLARIS.document.getById("polaris_paragraph_border_preview"))p.setStyle("border-top",a.getStyle("border-top")),p.setStyle("border-left",a.getStyle("border-left")),p.setStyle("border-bottom",a.getStyle("border-bottom")),p.setStyle("border-right",a.getStyle("border-right")),p.setStyle("background-color",a.getStyle("background-color"));var a=this.getContentElement("advanced","borderTop"),p=this.getContentElement("advanced",
"borderBottom"),e=this.getContentElement("advanced","borderLeft"),q=this.getContentElement("advanced","borderRight"),l=this.getContentElement("advanced","txtBorderColor"),u=this.getContentElement("advanced","txtBgColor"),w=this.getContentElement("advanced","txtBorderWidth"),z=this.getContentElement("advanced","selBorderStyle");a.setValue(""!=g&&"none"!=g);p.setValue(""!=h&&"none"!=h);e.setValue(""!=d&&"none"!=d);q.setValue(""!=m&&"none"!=m);l.setValue(f?f:"#000000");u.setValue(c?c:"#000000");w.setValue(k);
z.setValue(n?n:"solid");POLARIS.document.getById(G).setStyle("background-color",f?f:"#000000");POLARIS.document.getById(A).setStyle("background-color",c?c:"#ffffff")}else this.hide()},onOk:function(){for(var a=this.getParentEditor(),c=this.selectedElements,g=this.getContentElement("info","txtLeftMargin").getValue(),d=this.getContentElement("info","txtRightMargin").getValue(),h=this.getContentElement("info","txtTopMargin").getValue(),m=this.getContentElement("info","txtBottomMargin").getValue(),k=
this.getContentElement("info","radioFirstLineIndent").getValue(),l=this.getContentElement("info","txtIndentValue").getValue(),p=0;p<c.length;p++){var e=c[p];if(!(e.type=POLARIS.NODE_ELEMENT&&e.is({ol:1,ul:1,dl:1}))){""!=h?e.setStyle("margin-top",h+b.verticalUnit):e.removeStyle("margin-top");""!=m?e.setStyle("margin-bottom",m+b.verticalUnit):e.removeStyle("margin-bottom");""!=g?e.setStyle("margin-left",g+b.verticalUnit):e.removeStyle("margin-left");""!=d?e.setStyle("margin-right",d+b.verticalUnit):
e.removeStyle("margin-right");var f=0,q="";k==b.paragraph.firstLine.indent?q=l+b.verticalUnit:k==b.paragraph.firstLine.outdent&&(f=parseFloat(l),q="-"+f+b.verticalUnit);0==q.length?e.removeStyle("text-indent"):e.setStyle("text-indent",q);isNaN(f)||0==f||e.setStyle("margin-left",parseFloat(g)+f+b.verticalUnit);(f=POLARIS.document.getById("polaris_paragraph_border_preview"))&&e&&("none"==f.getStyle("border-top-style")?e.removeStyle("border-top"):(e.setStyle("border-top-color",f.getStyle("border-top-color")),
e.setStyle("border-top-style",f.getStyle("border-top-style")),e.setStyle("border-top-width",f.getStyle("border-top-width"))),"none"==f.getStyle("border-left-style")?e.removeStyle("border-left"):(e.setStyle("border-left-color",f.getStyle("border-left-color")),e.setStyle("border-left-style",f.getStyle("border-left-style")),e.setStyle("border-left-width",f.getStyle("border-left-width"))),"none"==f.getStyle("border-bottom-style")?e.removeStyle("border-bottom"):(e.setStyle("border-bottom-color",f.getStyle("border-bottom-color")),
e.setStyle("border-bottom-style",f.getStyle("border-bottom-style")),e.setStyle("border-bottom-width",f.getStyle("border-bottom-width"))),"none"==f.getStyle("border-right-style")?e.removeStyle("border-right"):(e.setStyle("border-right-color",f.getStyle("border-right-color")),e.setStyle("border-right-style",f.getStyle("border-right-style")),e.setStyle("border-right-width",f.getStyle("border-right-width"))),f.getStyle("background-color")?e.setStyle("background-color",f.getStyle("background-color")):
e.removeStyle("background-color"))}}POLARIS.tools.setTimeout(function(){if(y)for(var b=0;b<y.length;b++){var c=y[b];if(c.getState()==POLARIS.TRISTATE_ON){a.execCommand(c.name);break}}a.fire("saveSnapshot")},0,this)}}})})();