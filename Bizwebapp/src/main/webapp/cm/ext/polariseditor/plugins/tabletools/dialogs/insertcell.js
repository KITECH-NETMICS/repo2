﻿(function(){POLARIS.dialog.add("insertcell",function(c){function h(a,e,d){var f=[];c.ui.addButton(a,{label:e,toolbar:"dialog_property_button",click:d?d:function(){g&&g.setState(POLARIS.TRISTATE_OFF);this.setState(POLARIS.TRISTATE_ON);g=this}});if(e=c.ui.create(a))f.push('\x3cul class\x3d"polaris_dialog_property_buttons" style\x3d"display:inline-block;width:auto"\x3e'),f.push('\x3cli class\x3d"polaris_dialog_property_button"\x3e'),e.className=e.className?e.className+" polaris_dialog_button":"polaris_dialog_button",
e.render(c,f),f.push("\x3c/li\x3e"),f.push("\x3c/ul\x3e");b[a]=e;return f}var d=c.lang.table,b=[],g;return{title:d.cellInsert,minWidth:180,minHeight:36,resizable:POLARIS.DIALOG_RESIZE_NONE,contents:[{id:"info",label:c.lang.common.generalTab,elements:[{type:"html",html:"\x3cp\x3e"+d.cellInsert+"\x3c/p\x3e"},{type:"vbox",textalign:"center",children:[{type:"html",html:h("rowInsertBefore",d.row.insertBefore).join("")+'\x3cdiv style\x3d"text-align:center;padding-bottom:5px;"\x3e'+c.lang.common.alignTop+
"\x3c/div\x3e"},{type:"hbox",verticalalign:"middle",textalign:"center",widths:["50%","40px","40px","40px","50%"],children:[{type:"html",html:""},{type:"html",html:h("columnInsertBefore",d.column.insertBefore).join("")+'\x3cdiv style\x3d"text-align:right;padding-right:5px;"\x3e'+c.lang.common.alignLeft+"\x3c/div\x3e"},{type:"html",html:'\x3cdiv style\x3d"width:40px;"\x3e\x3c/div\x3e'},{type:"html",html:h("columnInsertAfter",d.column.insertAfter).join("")+'\x3cdiv style\x3d"text-align:left;padding-left:5px;"\x3e'+
c.lang.common.alignRight+"\x3c/div\x3e"},{type:"html",html:""}]},{type:"html",html:h("rowInsertAfter",d.row.insertAfter).join("")+'\x3cdiv style\x3d"text-align:center;padding-top:5px;"\x3e'+c.lang.common.alignBottom+"\x3c/div\x3e"}]}]}],onLoad:function(){},onShow:function(){g&&g.setState(POLARIS.TRISTATE_OFF)},onOk:function(){var a=this.getParentEditor();a.fire("saveSnapshot");b&&(b.rowInsertBefore&&b.rowInsertBefore.getState()==POLARIS.TRISTATE_ON?a.execCommand("rowInsertBefore"):b.columnInsertBefore&&
b.columnInsertBefore.getState()==POLARIS.TRISTATE_ON?a.execCommand("columnInsertBefore"):b.columnInsertAfter&&b.columnInsertAfter.getState()==POLARIS.TRISTATE_ON?a.execCommand("columnInsertAfter"):b.rowInsertAfter&&b.rowInsertAfter.getState()==POLARIS.TRISTATE_ON&&a.execCommand("rowInsertAfter"));a.fire("saveSnapshot")}}})})();