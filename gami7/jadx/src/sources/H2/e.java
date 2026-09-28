package H2;

import K1.m;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: h, reason: collision with root package name */
    public final Pattern f3441h;

    public e(String str) {
        Pattern compile = Pattern.compile(str);
        z2.h.e(compile, "compile(...)");
        this.f3441h = compile;
    }

    public static m a(e eVar, String str) {
        eVar.getClass();
        z2.h.f(str, "input");
        Matcher matcher = eVar.f3441h.matcher(str);
        z2.h.e(matcher, "matcher(...)");
        if (matcher.find(0)) {
            return new m(matcher, str);
        }
        return null;
    }

    public final String toString() {
        String pattern = this.f3441h.toString();
        z2.h.e(pattern, "toString(...)");
        return pattern;
    }
}
