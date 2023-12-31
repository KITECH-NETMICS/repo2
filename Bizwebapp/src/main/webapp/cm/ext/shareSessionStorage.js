var removeIfNotPresentSessionItems	= ["loginInfo"];

// transfers sessionStorage from one tab to another
var sessionStorage_transfer = function(event) {
  if(!event) { event = window.event; } // ie suq
  if(!event.newValue) return;          // do nothing if no value to work with
  if (event.key == 'getSessionStorage') {
    // another tab asked for the sessionStorage -> send it
    localStorage.setItem('sessionStorage', JSON.stringify(sessionStorage));
    // the other tab should now have it, so we're done with it.
    localStorage.removeItem('sessionStorage'); // <- could do short timeout as well.
  } else if (event.key == 'sessionStorage') {
    // another tab sent data <- get it
    var data = JSON.parse(event.newValue);
	//console.log("sessionStorage tran event ", event);
    for (var key in data) {
    	//console.log("sessionStorage tran read " + key, data[key]);
    	sessionStorage.setItem(key, data[key]);
    }
    for (var i=0; i<removeIfNotPresentSessionItems.length; i++) {
    	var	checkItem	= removeIfNotPresentSessionItems[i];
    	if (data[checkItem] == null) {
        	//console.log("sessionStorage tran remove " + checkItem);
    		sessionStorage.removeItem(checkItem);
    	}
    }
  }
};

// listen for changes to localStorage
if(window.addEventListener) {
  window.addEventListener("storage", sessionStorage_transfer, false);
} else {
  window.attachEvent("onstorage", sessionStorage_transfer);
};


// Ask other tabs for session storage (this is ONLY to trigger event)
if (!sessionStorage.length) {
  localStorage.setItem('getSessionStorage', 'foobar');
  localStorage.removeItem('getSessionStorage', 'foobar');
};