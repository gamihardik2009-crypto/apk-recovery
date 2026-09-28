package z;

import C0.C0024g;
import m.D0;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final D0 f11804a = new D0(I0.r.f3915a, 0, 0);

    public static final I0.G a(I0.I i2, C0024g c0024g) {
        I0.s sVar;
        I0.G b3 = i2.b(c0024g);
        int length = c0024g.f500a.length();
        C0024g c0024g2 = b3.f3864a;
        int length2 = c0024g2.f500a.length();
        int min = Math.min(length, 100);
        int i3 = 0;
        while (true) {
            sVar = b3.f3865b;
            if (i3 >= min) {
                break;
            }
            b(sVar.l(i3), length2, i3);
            i3++;
        }
        b(sVar.l(length), length2, length);
        int min2 = Math.min(length2, 100);
        for (int i4 = 0; i4 < min2; i4++) {
            c(sVar.i(i4), length, i4);
        }
        c(sVar.i(length2), length, length2);
        return new I0.G(c0024g2, new D0(sVar, c0024g.f500a.length(), c0024g2.f500a.length()));
    }

    public static final void b(int i2, int i3, int i4) {
        if (i2 < 0 || i2 > i3) {
            StringBuilder sb = new StringBuilder("OffsetMapping.originalToTransformed returned invalid mapping: ");
            sb.append(i4);
            sb.append(" -> ");
            sb.append(i2);
            sb.append(" is not in range of transformed text [0, ");
            throw new IllegalStateException(B1.t.j(sb, i3, ']').toString());
        }
    }

    public static final void c(int i2, int i3, int i4) {
        if (i2 < 0 || i2 > i3) {
            StringBuilder sb = new StringBuilder("OffsetMapping.transformedToOriginal returned invalid mapping: ");
            sb.append(i4);
            sb.append(" -> ");
            sb.append(i2);
            sb.append(" is not in range of original text [0, ");
            throw new IllegalStateException(B1.t.j(sb, i3, ']').toString());
        }
    }
}
