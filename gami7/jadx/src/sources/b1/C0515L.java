package b1;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: b1.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0515L extends C0514K {
    public C0515L(C0521S c0521s, WindowInsets windowInsets) {
        super(c0521s, windowInsets);
    }

    @Override // b1.C0518O
    public C0521S a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f7099c.consumeDisplayCutout();
        return C0521S.b(null, consumeDisplayCutout);
    }

    @Override // b1.C0518O
    public C0528e e() {
        DisplayCutout displayCutout;
        displayCutout = this.f7099c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0528e(displayCutout);
    }

    @Override // b1.AbstractC0513J, b1.C0518O
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0515L)) {
            return false;
        }
        C0515L c0515l = (C0515L) obj;
        return Objects.equals(this.f7099c, c0515l.f7099c) && Objects.equals(this.f7103g, c0515l.f7103g);
    }

    @Override // b1.C0518O
    public int hashCode() {
        return this.f7099c.hashCode();
    }
}
