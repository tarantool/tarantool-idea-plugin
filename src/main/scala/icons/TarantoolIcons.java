package icons;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;
import java.util.Objects;

public interface TarantoolIcons {

    Icon Tarantool13 = load("tarantool-icon-13.svg");

    static Icon load(String path) {
        Objects.requireNonNull(path);
        Icon icon = IconLoader.getIcon("/icons/" + path, TarantoolIcons.class);
        return Objects.requireNonNull(icon);
    }

}
