package J0;

import java.util.Locale;
import z2.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f4321a;

    public a(Locale locale) {
        this.f4321a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return h.a(this.f4321a.toLanguageTag(), ((a) obj).f4321a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f4321a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f4321a.toLanguageTag();
    }
}
