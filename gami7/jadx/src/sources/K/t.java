package K;

import D.C0046o;
import J.C0255b;
import J.C0257c;
import J.C0292u;
import J.G0;
import J.InterfaceC0259d;
import java.util.ArrayList;
import n2.AbstractC0959k;

/* loaded from: classes.dex */
public final class t extends G {

    /* renamed from: c, reason: collision with root package name */
    public static final t f4492c = new t(1, 0, 2);

    @Override // K.G
    public final void a(C0046o c0046o, InterfaceC0259d interfaceC0259d, G0 g02, C0292u c0292u) {
        C0255b c0255b;
        int c3;
        int c4 = c0046o.c(0);
        if (!(g02.f4028n == 0)) {
            C0257c.y("Cannot move a group while inserting");
            throw null;
        }
        if (!(c4 >= 0)) {
            C0257c.y("Parameter offset is out of bounds");
            throw null;
        }
        if (c4 == 0) {
            return;
        }
        int i2 = g02.f4032s;
        int i3 = g02.f4034u;
        int i4 = g02.f4033t;
        int i5 = i2;
        while (c4 > 0) {
            i5 += C0257c.j(g02.f4016b, g02.p(i5));
            if (i5 > i4) {
                C0257c.y("Parameter offset is out of bounds");
                throw null;
            }
            c4--;
        }
        int j3 = C0257c.j(g02.f4016b, g02.p(i5));
        int f3 = g02.f(g02.f4016b, g02.p(g02.f4032s));
        int f4 = g02.f(g02.f4016b, g02.p(i5));
        int i6 = i5 + j3;
        int f5 = g02.f(g02.f4016b, g02.p(i6));
        int i7 = f5 - f4;
        g02.t(i7, Math.max(g02.f4032s - 1, 0));
        g02.s(j3);
        int[] iArr = g02.f4016b;
        int p3 = g02.p(i6) * 5;
        AbstractC0959k.p(iArr, iArr, g02.p(i2) * 5, p3, (j3 * 5) + p3);
        if (i7 > 0) {
            Object[] objArr = g02.f4017c;
            AbstractC0959k.q(objArr, objArr, f3, g02.g(f4 + i7), g02.g(f5 + i7));
        }
        int i8 = f4 + i7;
        int i9 = i8 - f3;
        int i10 = g02.f4025k;
        int i11 = g02.f4026l;
        int length = g02.f4017c.length;
        int i12 = g02.f4027m;
        int i13 = i2 + j3;
        int i14 = i2;
        while (i14 < i13) {
            int p4 = g02.p(i14);
            int i15 = i13;
            int i16 = i9;
            iArr[(p4 * 5) + 4] = G0.h(G0.h(g02.f(iArr, p4) - i9, i12 < p4 ? 0 : i10, i11, length), g02.f4025k, g02.f4026l, g02.f4017c.length);
            i14++;
            i9 = i16;
            i13 = i15;
            i10 = i10;
            i11 = i11;
        }
        int i17 = i6 + j3;
        int n3 = g02.n();
        int n4 = C0257c.n(g02.f4018d, i6, n3);
        ArrayList arrayList = new ArrayList();
        if (n4 >= 0) {
            while (n4 < g02.f4018d.size() && (c3 = g02.c((c0255b = (C0255b) g02.f4018d.get(n4)))) >= i6 && c3 < i17) {
                arrayList.add(c0255b);
                g02.f4018d.remove(n4);
            }
        }
        int i18 = i2 - i6;
        int size = arrayList.size();
        for (int i19 = 0; i19 < size; i19++) {
            C0255b c0255b2 = (C0255b) arrayList.get(i19);
            int c5 = g02.c(c0255b2) + i18;
            if (c5 >= g02.f4021g) {
                c0255b2.f4117a = -(n3 - c5);
            } else {
                c0255b2.f4117a = c5;
            }
            g02.f4018d.add(C0257c.n(g02.f4018d, c5, n3), c0255b2);
        }
        if (!(!g02.C(i6, j3))) {
            C0257c.y("Unexpectedly removed anchors");
            throw null;
        }
        g02.l(i3, g02.f4033t, i2);
        if (i7 > 0) {
            g02.D(i8, i7, i6 - 1);
        }
    }

    @Override // K.G
    public final String b(int i2) {
        return K1.f.s(i2, 0) ? "offset" : super.b(i2);
    }
}
