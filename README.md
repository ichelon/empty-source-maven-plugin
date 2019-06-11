# empty source maven plugin

重写maven源代码插件maven-plugin-plugin，导出一个空的源码包。
由于[oss](https://central.sonatype.org/pages/requirements.html)的验证要求，上传的jar文件必须包含源代码，
因此编写此插件帮助跳过sources检查。

## 例子
```
<build>
    <plugins>
        <plugin>
            <groupId>com.github.ichelon</groupId>
            <artifactId>empty-source-maven-plugin</artifactId>
            <version>1.0.0.RELEASE</version>
            <configuration>
                <attach>true</attach>
                <forceCreation>true</forceCreation>
            </configuration>
            <executions>
                <execution>
                    <phase>compile</phase>
                    <goals>
                        <goal>jar-no-fork</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>

```