plugins {
	id("com.android.application")
	id("org.jetbrains.kotlin.android")
	id("kotlin-kapt")
}

android {
	namespace = "com.isaev.chat"
	compileSdk = 34

	defaultConfig {
		applicationId = "com.isaev.chat"
		minSdk = 24
		targetSdk = 33
		versionCode = 1
		versionName = "1.0"
		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
	}

	buildTypes {
		release {
			isMinifyEnabled = false
			proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
		}
	}
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}

	kotlinOptions {
		jvmTarget = "1.8"
	}

	buildFeatures {
		viewBinding = true
	}
}

dependencies {
  // Standart libs
	implementation ("androidx.core:core-ktx:1.13.1")
	implementation ("androidx.appcompat:appcompat:1.7.0")
	implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
	implementation ("androidx.legacy:legacy-support-v4:1.0.0")
	implementation ("com.google.android.material:material:1.12.0")

  // Lifecycle libs
	implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.8.1")
	implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.1")

	// Firebase libs
  implementation ("com.google.firebase:firebase-messaging-ktx:24.0.0")

	// Unit testing dependencies
	implementation ("androidx.test:monitor:1.7.1")
	implementation ("androidx.test.ext:junit-ktx:1.2.1")
	testImplementation ("androidx.arch.core:core-testing:2.2.0")
	testImplementation ("junit:junit:4.13.2")

  // AndroidX Test - Instrumented testing
	androidTestImplementation ("androidx.test.ext:junit:1.2.1")
	androidTestImplementation ("androidx.test.espresso:espresso-core:3.6.1")
	androidTestImplementation ("androidx.test:runner:1.6.1")
	androidTestImplementation ("androidx.test:rules:1.6.1")

	// androidTestImplementation ("org.mockito:mockito-android:3.3.3")
  // testImplementation ("org.mockito:mockito-core:3.3.3")
  // testImplementation ("org.mockito:mockito-inline:3.3.3")
	// testImplementation ("org.robolectric:robolectric:4.13")

	// Test mock libs
	testImplementation ("io.mockk:mockk:1.13.5")

	// REST API libs
	implementation ("com.squareup.retrofit2:retrofit:2.9.0")
	implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

	// Navigation fragments libs
	implementation ("androidx.navigation:navigation-fragment-ktx:2.7.7")
	implementation ("androidx.navigation:navigation-ui-ktx:2.7.7")
}