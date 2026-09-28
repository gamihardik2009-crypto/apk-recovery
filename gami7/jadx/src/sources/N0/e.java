package N0;

import B1.C;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f4981b = 66305;

    /* renamed from: a, reason: collision with root package name */
    public final int f4982a;

    public static String a(int i2) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i3 = i2 & 255;
        String str = "Invalid";
        sb.append((Object) (C.P(i3, 1) ? "Strategy.Simple" : C.P(i3, 2) ? "Strategy.HighQuality" : C.P(i3, 3) ? "Strategy.Balanced" : C.P(i3, 0) ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int i4 = (i2 >> 8) & 255;
        sb.append((Object) (B2.a.o(i4, 1) ? "Strictness.None" : B2.a.o(i4, 2) ? "Strictness.Loose" : B2.a.o(i4, 3) ? "Strictness.Normal" : B2.a.o(i4, 4) ? "Strictness.Strict" : B2.a.o(i4, 0) ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int i5 = (i2 >> 16) & 255;
        if (i5 == 1) {
            str = "WordBreak.None";
        } else if (i5 == 2) {
            str = "WordBreak.Phrase";
        } else if (i5 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f4982a == ((e) obj).f4982a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4982a);
    }

    public final String toString() {
        return a(this.f4982a);
    }
}
