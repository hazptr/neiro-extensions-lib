# neiro-extensions-lib

Extension stubs for [Neiro](https://github.com/hazptr/neiro), a Mihon fork that plays background
music provided by a source. It is [keiyoushi/extensions-lib](https://github.com/keiyoushi/extensions-lib)
(itself based on [mihonapp/tachiyomix](https://github.com/mihonapp/tachiyomix)) plus one additive API:
`ChapterAudio`, attached to a chapter's page list through `Page.chapterAudio`.

Extensions built against it still run on apps without the API, as long as every reference to the
audio types sits behind a `runCatching`: the `LinkageError` is absorbed and the chapter reads with no
music.

## Usage

Add the `jitpack.io` repository to your root `settings.gradle.kts`:
```kotlin
dependencyResolutionManagement {
    repositories {
        maven(url = "https://www.jitpack.io")
    }
}
```

Then add the dependency:

```kotlin
dependencies {
    compileOnly("com.github.hazptr:neiro-extensions-lib:1.6.1")
}
```

`compileOnly` because this library provides stubs only; the implementations live in the host app.

## 🔧 App Dependency Requirements

Host apps using `tachiyomix` must include the following dependencies (or newer compatible versions) to ensure compatibility with version **1.6**:

| Dependency            | Artifact(s)                                                                                                                                                                 | Version  |
|-----------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------|
| Kotlin                | `org.jetbrains.kotlin:kotlin-stdlib`                                                                                                                                        | `2.4.0`  |
| kotlinx.coroutines    | `org.jetbrains.kotlinx:kotlinx-coroutines-core`                                                                                                                             | `1.10.2` |
| kotlinx.serialization | `org.jetbrains.kotlinx:kotlinx-serialization-json` <br> `org.jetbrains.kotlinx:kotlinx-serialization-json-okio` <br> `org.jetbrains.kotlinx:kotlinx-serialization-protobuf` | `1.7.3`  |
| OkHttp                | `com.squareup.okhttp3:okhttp` <br> `com.squareup.okhttp3:okhttp-brotli` <br> `com.squareup.okhttp3:okhttp-zstd`                                                             | `5.4.0`  |
| jsoup                 | `org.jsoup:jsoup`                                                                                                                                                           | `1.22.2` |
| Injekt                | `com.github.mihonapp:injekt`                                                                                                                                                | `1.0.0`  |

## 📄 License

neiro-extensions-lib is distributed under the [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0).
