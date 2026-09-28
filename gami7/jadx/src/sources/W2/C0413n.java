package W2;

import java.util.Arrays;

/* renamed from: W2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413n extends y {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6150l;

    public C0413n(String str, C0414o c0414o) {
        super(str, c0414o, 1);
        this.f6150l = true;
    }

    public final boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0413n) {
            U2.f fVar = (U2.f) obj;
            if (z2.h.a(this.f6166a, fVar.b())) {
                C0413n c0413n = (C0413n) obj;
                if (c0413n.f6150l && Arrays.equals((U2.f[]) this.f6175j.getValue(), (U2.f[]) c0413n.f6175j.getValue())) {
                    int f3 = fVar.f();
                    int i3 = this.f6168c;
                    if (i3 == f3) {
                        for (0; i2 < i3; i2 + 1) {
                            i2 = (z2.h.a(d(i2).b(), fVar.d(i2).b()) && z2.h.a(d(i2).e(), fVar.d(i2).e())) ? i2 + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // W2.y
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
