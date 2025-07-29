# Specify the entrypoint where ProGuard starts to determine what's reachable.
-keep class com.braintrustdata.api.proguard.** { *; }

# For the testing framework.
-keep class org.junit.** { *; }