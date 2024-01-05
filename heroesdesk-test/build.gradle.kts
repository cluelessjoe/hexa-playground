group = "org.hexastacks"
version = "1.0-SNAPSHOT"


dependencies {
    implementation(project(":heroesdesk"))
    implementation(libs.arrow.core)

    // TODO: ideally it should be implementation(libs.kotlin.test) but this doesn't provide @Test import in src/main/kotlin, hence fallbacking to the following
    implementation(libs.jupiter.api)
    testRuntimeOnly(libs.jupiter.engine)
}


tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.test {
    useJUnitPlatform()
}