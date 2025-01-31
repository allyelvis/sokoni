const error = {
   webView: android.webView.getMapValue("webView.error.webView"),
   code: android.webView.getMapValue("webView.error.code"),
   message: android.webView.getMapValue("webView.error.description"),
   url: android.webView.getMapValue("webView.error.url")
}
const errors = {
"-4" : "User authentication failed on server",
"-12": "Malformed URL",
"-6": "Failed to connect to the server",
"-11": "Failed to perform SSL handshake",
"-13": "Generic file error",
"-14": "File not found",
"-2": "Server or proxy hostname lookup failed",
"-7": "Failed to read or write to the server",
"-5": "User authentication failed on proxy",
"-9": "Too many redirects",
"-8": "Connection timed out",
"-15":"Too many requests during this load",
"-1": "Generic error",
"-16": "Resource load was canceled by Safe Browsing",
"-3": "Unsupported authentication scheme"
}  

function reload() {
  android.control.execute("views."+error.webView+".reload()");
}  

function onLoad() {
  var message = errors[error.code];
  if(!message) message = error.message;
  document.getElementById("message")
    .innerText=message;
}  