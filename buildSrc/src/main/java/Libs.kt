object Libs {

    // ClassPath
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildGradleVersion}"
    const val kotlinGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    const val protobufGradle =
        "com.google.protobuf:protobuf-gradle-plugin:${Versions.protobufGradleVersion}"
    const val googleService = "com.google.gms:google-services:${Versions.googleServiceVersion}"
    const val firebaseCrashlyticsGradle =
        "com.google.firebase:firebase-crashlytics-gradle:${Versions.firebaseCrashlyticsGradleVersion}"
    const val sentryGradle =
        "io.sentry:sentry-android-gradle-plugin:${Versions.sentryGradleVersion}"
    const val r8 = "com.android.tools:r8:${Versions.r8Version}"
    const val androidJunit5Version =
        "de.mannodermaus.gradle.plugins:android-junit5:${Versions.androidJunit5Version}"
    const val perfPlugin = "com.google.firebase:perf-plugin:${Versions.perfPluginVersion}"
    const val androidMavenGradle =
        "com.github.dcendents:android-maven-gradle-plugin:${Versions.androidMavenGradleVersion}"
    const val detektGradle =
        "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${Versions.detektGradleVersion}"

    const val hiltPlugin =  "com.google.dagger:hilt-android-gradle-plugin:${Versions.hiltVersion}"

    // Kotlin
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlinVersion}"

    // Coroutines
    const val coroutineAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.androidVersion}"
    const val coroutineCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.androidVersion}"

    // rx java
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJavaVersion}"
    const val rxAndroid ="io.reactivex.rxjava2:rxandroid:${Versions.rxAndroidVersion}"

    // AndroidX
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
    const val constraintlayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    const val legacySupport =
        "androidx.legacy:legacy-support-v4:${Versions.legacySupportVersion}"
    const val activity = "androidx.activity:activity:${Versions.activityVersion}"
    const val activityKtx = "androidx.activity:activity-ktx:${Versions.activityVersion}"
    const val fragment = "androidx.fragment:fragment:${Versions.fragmentVersion}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragmentVersion}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerviewVersion}"
    const val viewpager2 = "androidx.viewpager2:viewpager2:${Versions.viewpager2Version}"
    const val swipeRefreshLayout =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefreshLayoutVersion}"
    const val databindingCompiler =
        "com.android.databinding:compiler:${Versions.databindingVersion}"

    // Work
    const val workRuntime = "androidx.work:work-runtime:${Versions.workVersion}"
    const val workRuntimeKtx = "androidx.work:work-runtime-ktx:${Versions.workVersion}"

    // Test
    const val testCore = "androidx.test:core:${Versions.testVersion}"
    const val testrunner = "androidx.test:runner:${Versions.testVersion}"
    const val testrules = "androidx.test:rules:${Versions.testVersion}"
    const val espressoCore =
        "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"
    const val junitExt = "androidx.test.ext:junit:${Versions.junitExtVersion}"

    // Lifecycle
    const val viewModel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifeCycleVersion}"
    const val extensions =
        "androidx.lifecycle:lifecycle-extensions:${Versions.lifeCycleVersion}"
    const val liveData =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifeCycleVersion}"
    const val commonJava8 =
        "androidx.lifecycle:lifecycle-common-java8:${Versions.lifeCycleVersion}"
    const val compiler =
        "androidx.lifecycle:lifecycle-compiler:${Versions.lifeCycleVersion}"
    const val viewModelSavedState =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifeCycleVersion}"

    // Room
    const val roomRuntime = "androidx.room:room-runtime:${Versions.roomVersion}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.roomVersion}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.roomVersion}"

    // Navigation
    const val navFragment =
        "androidx.navigation:navigation-ui:${Versions.navigationVersion}"
    const val navFragmentKtx =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
    const val navUi = "androidx.navigation:navigation-ui:${Versions.navigationVersion}"
    const val navUiKtx =
        "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"

    // StartUp
    const val startUp = "androidx.startup:startup-runtime:${Versions.startupVersion}"

    // Google
    const val material = "com.google.android.material:material:${Versions.materialVersion}"
    const val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glideVersion}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glideVersion}"
    const val exoplayer = "com.google.android.exoplayer:exoplayer:${Versions.exoplayerVersion}"
    const val exoplayerCore =
        "com.google.android.exoplayer:exoplayer-core:${Versions.exoplayerVersion}"
    const val exoplayerDash =
        "com.google.android.exoplayer:exoplayer-dash:${Versions.exoplayerVersion}"
    const val exoplayerUi = "com.google.android.exoplayer:exoplayer-ui:${Versions.exoplayerVersion}"
    const val flexboxLayout = "com.google.android:flexbox:${Versions.flexboxLayoutVersion}"
    const val firebaseCrashlytics =
        "com.google.firebase:firebase-crashlytics:${Versions.firebaseCrashlyticsVersion}"
    const val firebaseAnalytics =
        "com.google.firebase:firebase-analytics:${Versions.firebaseAnalyticsVersion}"

    // Google Cloud Speech
    const val grpc = "io.grpc:grpc-okhttp:${Versions.grpcVersion}"
    const val grpcStub = "io.grpc:grpc-stub:${Versions.grpcVersion}"
    const val googleCloudSpeech =
        "com.google.cloud:google-cloud-speech:${Versions.googleCloudSpeechVersion}"
    const val grpcGoogleCloudSpeech =
        "com.google.api.grpc:grpc-google-cloud-speech-v1p1beta1:${Versions.grpcGoogleCloudSpeechVersion}"

    // Google Protobuf
    const val protoc = "com.google.protobuf:protoc:${Versions.protocVersion}"
    const val protocGrpc = "io.grpc:protoc-gen-grpc-java:${Versions.protocGrpcVersion}"

    // Junit
    const val junit4 = "junit:junit:${Versions.junitVersion}"

    // Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val gsonConverter =
        "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"

    // Moshi
    const val moshiCore = "com.squareup.moshi:moshi:${Versions.moshiVersion}"
    const val moshiCodegen =
        "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshiVersion}"

    // Okhttp
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp3Version}"
    const val loggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp3Version}"

    // RxBiding
    const val rxbinding = "com.jakewharton.rxbinding3:rxbinding:${Versions.rxbindingVersion}"

    // Lottie
    const val lottie = "com.airbnb.android:lottie:${Versions.lottieVerison}"

    // Aws Sdk
    const val awsSdkCognito = "com.amazonaws:aws-android-sdk-cognito:${Versions.awsSdkVersion}"
    const val awsSdkS3 = "com.amazonaws:aws-android-sdk-s3:${Versions.awsSdkVersion}"

    // Debug
    const val timber = "com.jakewharton.timber:timber:${Versions.timberVersion}"
    const val rxLogs = "com.github.umair13adil:RxLogs:${Versions.rxLogsVersion}"
    const val leakcanary =
        "com.squareup.leakcanary:leakcanary-android:${Versions.leakcanaryVersion}"
    const val stetho = "com.facebook.stetho:stetho:${Versions.stethoVersion}"
    const val stethoOkhttp3 = "com.facebook.stetho:stetho-okhttp3:${Versions.stethoVersion}"
    const val stethoJs = "com.facebook.stetho:stetho-js-rhino:${Versions.stethoVersion}"
    const val sentry = "io.sentry:sentry-android:${Versions.sentryVersion}"

    // File Downloader
    const val fetch2 = "androidx.tonyodev.fetch2:xfetch2:${Versions.fetch2Version}"

    // CustomView
    const val materialSpinner = "com.jaredrummler:material-spinner:${Versions.materialSpinner}"
    const val fancybuttonsVersion = "com.github.medyo:fancybuttons:${Versions.fancybuttonsVersion}"
    const val indicatorseekbar =
        "com.github.warkiz.widget:indicatorseekbar:${Versions.indicatorseekbar}"
    const val circleIndicatorVersion = "me.relex:circleindicator:${Versions.circleIndicatorVersion}"

    // Recyclerview Delegate
    const val adapterdelegates =
        "com.hannesdorfmann:adapterdelegates4-kotlin-dsl:${Versions.adapterdelegatesVersion}"
    const val adapterdelegatesViewBinding =
        "com.hannesdorfmann:adapterdelegates4-kotlin-dsl-viewbinding:${Versions.adapterdelegatesVersion}"

    // Pdf Generator
    const val itextpdf = "com.itextpdf:itextpdf:${Versions.itextpdfVersion}"

    // Klint
    const val klint = "com.pinterest:ktlint:${Versions.klintVersion}"

    // Koin
    const val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koinVersion}"

    // Hilt
    const val hiltAndroid =  "com.google.dagger:hilt-android:${Versions.hiltVersion}"
    const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hiltVersion}"

    const val hiltViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltViewmodels}"
    const val hiltCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltViewmodels}"
}
