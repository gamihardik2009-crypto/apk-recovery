package W0;

import B1.t;
import android.graphics.Insets;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f5890e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f5891a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5892b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5893c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5894d;

    public b(int i2, int i3, int i4, int i5) {
        this.f5891a = i2;
        this.f5892b = i3;
        this.f5893c = i4;
        this.f5894d = i5;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f5891a, bVar2.f5891a), Math.max(bVar.f5892b, bVar2.f5892b), Math.max(bVar.f5893c, bVar2.f5893c), Math.max(bVar.f5894d, bVar2.f5894d));
    }

    public static b b(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f5890e : new b(i2, i3, i4, i5);
    }

    public static b c(Insets insets) {
        int i2;
        int i3;
        int i4;
        int i5;
        i2 = insets.left;
        i3 = insets.top;
        i4 = insets.right;
        i5 = insets.bottom;
        return b(i2, i3, i4, i5);
    }

    public final Insets d() {
        return a.a(this.f5891a, this.f5892b, this.f5893c, this.f5894d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5894d == bVar.f5894d && this.f5891a == bVar.f5891a && this.f5893c == bVar.f5893c && this.f5892b == bVar.f5892b;
    }

    public final int hashCode() {
        return (((((this.f5891a * 31) + this.f5892b) * 31) + this.f5893c) * 31) + this.f5894d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f5891a);
        sb.append(", top=");
        sb.append(this.f5892b);
        sb.append(", right=");
        sb.append(this.f5893c);
        sb.append(", bottom=");
        return t.j(sb, this.f5894d, '}');
    }
}
