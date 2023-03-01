import 'package:flutter/material.dart';
import 'package:webview_flutter/webview_flutter.dart';

void main() => runApp(MelonCord());

const String appName = "MelonCord";
const String url = "https://discord.com/app";
const Color appColor = Colors.black;

// ignore: must_be_immutable
class MelonCord extends StatelessWidget {
    // ignore: unused_field
    WebViewController _controller;
    @override
    Widget build(BuildContext context) {
        return MaterialApp(
            title: appName,
            theme: ThemeData(
                primarySwatch: appColor,
            ),
            home: Scaffold(
                appBar: AppBar(
                    title: Text(appName),
                ),
                body: Center(
                    child: WebView(
                        initialUrl: url,
                        javascriptMode: JavascriptMode.unrestricted,
                        onWebViewCreated: (WebViewController webViewController) {
                          _controller = webViewController;
                        },
                    ),
                ),
            ),
        );
    }
}
