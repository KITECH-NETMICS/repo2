﻿(function(){POLARIS.dialog.add("paragraphformat",function(e){function l(k,a,c,b){e.ui.addButton(k,{label:a,click:b?b:function(){if(d)for(var a=0;a<d.length;a++){var c=d[a];m[k]!=c?c.getState()==POLARIS.TRISTATE_ON&&c.setState(POLARIS.TRISTATE_OFF):this.setState(POLARIS.TRISTATE_ON)}}});if(a=e.ui.create(k))c.push('\x3cli class\x3d"polaris_dialog_paragraph_property_button"\x3e'),a.className=a.className?a.className+" polaris_dialog_paragraph_button":"polaris_dialog_paragraph_button",a.overrideSize="49px",
a.iconSize="polaris_paragraph_button_icon_large",a.render(e,c),c.push("\x3c/li\x3e");d.push(a);m[k]=a}var a=e.lang.list,g=[{name:a.bulletedShapeNameList.none,style:"",command:"ko"==POLARIS.lang.detect()?"bulledtednone_kr":"bulledtednone",label:a.bulletedShapeLabelList.none},{name:a.bulletedShapeNameList.disc,style:"disc",command:a.bulletedShapeNameList.disc,label:a.bulletedShapeLabelList.disc},{name:a.bulletedShapeNameList.circle,style:"circle",command:a.bulletedShapeNameList.circle,label:a.bulletedShapeLabelList.circle},
{name:a.bulletedShapeNameList.square,style:"square",command:a.bulletedShapeNameList.square,label:a.bulletedShapeLabelList.square}],h=[{name:a.numberedShapeNameList.decimal,style:"decimal",command:a.numberedShapeNameList.decimal,label:a.numberedShapeLabelList.decimal},{name:a.numberedShapeNameList.upperalpha,style:"upper-alpha",command:a.numberedShapeNameList.upperalpha,label:a.numberedShapeLabelList.upperalpha},{name:a.numberedShapeNameList.loweralpha,style:"lower-alpha",command:a.numberedShapeNameList.loweralpha,
label:a.numberedShapeLabelList.loweralpha},{name:a.numberedShapeNameList.upperroman,style:"upper-roman",command:a.numberedShapeNameList.upperroman,label:a.numberedShapeLabelList.upperroman},{name:a.numberedShapeNameList.lowerroman,style:"lower-roman",command:a.numberedShapeNameList.lowerroman,label:a.numberedShapeLabelList.lowerroman}],d=[],m=[],f=[];f.push("\x3cspan\x3e"+a.bulletedParagraph+'\x3c/span\x3e\x3cul class\x3d"polaris_dialog_property_buttons"\x3e');for(var b=0;b<g.length;b++)l(g[b].name,
g[b].label,f);f.push("\x3c/ul\x3e\x3c/span\x3e");f.push("\x3cspan\x3e"+a.numberedParagraph+'\x3c/span\x3e\x3cul class\x3d"polaris_dialog_property_buttons"\x3e');for(b=0;b<h.length;b++)l(h[b].name,h[b].label,f);f.push("\x3c/ul\x3e\x3c/span\x3e");return{title:e.lang.list.paragraphFormat.title,minWidth:280,minHeight:180,resizable:POLARIS.DIALOG_RESIZE_NONE,contents:[{id:"paragraphnumber",label:e.lang.list.paragraphFormatLabel,elements:[{id:"paragrapFormatSelector",type:"html",focus:!0,html:f.join("")}]}],
onShow:function(){if(d)for(var a=0;a<d.length;a++)d[a].setState(POLARIS.TRISTATE_OFF);(a=e.elementPath())?(a=(a=a.contains({ol:1,ul:1},1))&&a.getStyle("list-style-type"),"disc"==a?d[1].setState(POLARIS.TRISTATE_ON):"circle"==a?d[2].setState(POLARIS.TRISTATE_ON):"square"==a?d[3].setState(POLARIS.TRISTATE_ON):"decimal"==a?d[4].setState(POLARIS.TRISTATE_ON):"upper-alpha"==a?d[5].setState(POLARIS.TRISTATE_ON):"lower-alpha"==a?d[6].setState(POLARIS.TRISTATE_ON):"upper-roman"==a?d[7].setState(POLARIS.TRISTATE_ON):
"lower-roman"==a?d[8].setState(POLARIS.TRISTATE_ON):d[0].setState(POLARIS.TRISTATE_ON)):d[0].setState(POLARIS.TRISTATE_ON)},onOk:function(){var a=this.getParentEditor();a.pagination&&a.pagination.adjustCaret(a);a.fire("saveSnapshot");if(d){var b;for(b=0;b<d.length;b++){var c=d[b];if(c.getState()==POLARIS.TRISTATE_ON){a=c.name;b=void 0;for(c=0;c<g.length;c++)if(g[c].name===a){b=g[c];break}if(!b)for(c=0;c<h.length;c++)if(h[c].name===a){b=h[c];break}a=this.getParentEditor();b&&b.command?a.execCommand(b.command,
{fromPopup:!0}):a.execCommand("removelist");break}}}a.fire("saveSnapshot")}}})})();