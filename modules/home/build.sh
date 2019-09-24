../../gradlew assembleDebug
adb push build/outputs/apk/debug/home-debug.apk /storage/emulated/0/Android/data/com.github.pgycode.weibo/files/home.apk

# 关闭App
/Users/haha/Library/Android/sdk/platform-tools/adb shell am force-stop com.github.pgycode.weibo

# 启动App
/Users/haha/Library/Android/sdk/platform-tools/adb shell am start -n com.github.pgycode.weibo/com.github.pgycode.weibo.app.act.HomeActivity