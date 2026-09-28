package b1;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: b1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0528e {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f7119a;

    public C0528e(DisplayCutout displayCutout) {
        this.f7119a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0528e.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f7119a, ((C0528e) obj).f7119a);
    }

    public final int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f7119a;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f7119a + "}";
    }
}
