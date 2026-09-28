package H;

import C0.C0018a;
import J.C0275l;
import J.C0285q;
import J.C0291t0;
import J.InterfaceC0258c0;
import a.AbstractC0423a;
import com.example.bulksmsscheduler.R;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Locale;
import s.C1160M;

/* renamed from: H.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0231z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1160M f3359a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f3360b = 16;

    static {
        float f3 = 24;
        f3359a = androidx.compose.foundation.layout.a.c(f3, 10, f3, 0.0f, 8);
    }

    public static final void a(Long l3, y2.c cVar, I i2, E2.d dVar, J0 j02, InterfaceC0180q3 interfaceC0180q3, B0 b02, C0285q c0285q, int i3) {
        int i4;
        C0189s0 c0189s0;
        Locale locale;
        c0285q.W(643325609);
        if ((i3 & 6) == 0) {
            i4 = (c0285q.g(l3) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0285q.i(cVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0285q.i(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0285q.i(dVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= (i3 & 32768) == 0 ? c0285q.g(j02) : c0285q.i(j02) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0285q.g(interfaceC0180q3) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= c0285q.g(b02) ? 1048576 : 524288;
        }
        int i5 = i4;
        if ((i5 & 599187) == 599186 && c0285q.A()) {
            c0285q.P();
        } else {
            Locale p3 = D1.p(c0285q);
            c0285q.V(-356766397);
            boolean g3 = c0285q.g(p3);
            Object K3 = c0285q.K();
            Object obj = C0275l.f4150a;
            if (g3 || K3 == obj) {
                ((J) i2).getClass();
                K3 = D1.o(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(p3), p3));
                c0285q.e0(K3);
            }
            C0189s0 c0189s02 = (C0189s0) K3;
            c0285q.r(false);
            String w2 = D1.w(R.string.m3c_date_input_invalid_for_pattern, c0285q);
            String w3 = D1.w(R.string.m3c_date_input_invalid_year_range, c0285q);
            String w4 = D1.w(R.string.m3c_date_input_invalid_not_allowed, c0285q);
            c0285q.V(-356766049);
            boolean g4 = c0285q.g(c0189s02) | ((i5 & 57344) == 16384 || ((i5 & 32768) != 0 && c0285q.g(j02)));
            Object K4 = c0285q.K();
            if (g4 || K4 == obj) {
                c0189s0 = c0189s02;
                locale = p3;
                Object a02 = new A0(dVar, interfaceC0180q3, c0189s02, j02, w2, w3, w4);
                c0285q.e0(a02);
                K4 = a02;
            } else {
                c0189s0 = c0189s02;
                locale = p3;
            }
            A0 a03 = (A0) K4;
            c0285q.r(false);
            String upperCase = c0189s0.f3073a.toUpperCase(Locale.ROOT);
            z2.h.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String w5 = D1.w(R.string.m3c_date_input_label, c0285q);
            V.o h2 = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.c.f6639a, f3359a);
            a03.getClass();
            R.a b3 = R.b.b(c0285q, -1819015125, new C0148m(w5, 2, upperCase));
            R.a b4 = R.b.b(c0285q, -564233108, new C0195t0(upperCase, 0));
            int i6 = i5 << 3;
            b(h2, l3, cVar, i2, b3, b4, 0, a03, c0189s0, locale, b02, c0285q, (i6 & 112) | 1794054 | (i6 & 896) | (i6 & 7168), (i5 >> 18) & 14);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0201u0(l3, cVar, i2, dVar, j02, interfaceC0180q3, b02, i3);
        }
    }

    public static final void b(V.o oVar, Long l3, y2.c cVar, I i2, y2.e eVar, y2.e eVar2, int i3, A0 a02, C0189s0 c0189s0, Locale locale, B0 b02, C0285q c0285q, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        K1.e eVar3;
        Object[] objArr;
        InterfaceC0258c0 interfaceC0258c0;
        int i10;
        c0285q.W(-857008589);
        if ((i4 & 6) == 0) {
            i6 = (c0285q.g(oVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c0285q.g(l3) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c0285q.i(cVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= c0285q.i(i2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= c0285q.i(eVar) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= c0285q.i(eVar2) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= c0285q.e(i3) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= c0285q.g(a02) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= c0285q.g(c0189s0) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= c0285q.i(locale) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i7 = i5 | (c0285q.g(b02) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i6 & 306783379) == 306783378 && (i7 & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            int i11 = i6;
            InterfaceC0258c0 interfaceC0258c02 = (InterfaceC0258c0) AbstractC0423a.Y(new Object[0], null, null, C0100f0.f2562m, c0285q, 3072, 6);
            Object[] objArr2 = new Object[0];
            K1.e eVar4 = I0.z.f3931d;
            c0285q.V(1947288557);
            int i12 = i11 & 234881024;
            boolean i13 = ((i11 & 112) == 32) | c0285q.i(i2) | (i12 == 67108864) | c0285q.i(locale);
            Object K3 = c0285q.K();
            Object obj = C0275l.f4150a;
            if (i13 || K3 == obj) {
                i8 = i12;
                i9 = i11;
                eVar3 = eVar4;
                objArr = objArr2;
                Object c0225y0 = new C0225y0(l3, i2, c0189s0, locale, 0);
                c0285q.e0(c0225y0);
                K3 = c0225y0;
            } else {
                i8 = i12;
                i9 = i11;
                eVar3 = eVar4;
                objArr = objArr2;
            }
            c0285q.r(false);
            InterfaceC0258c0 X3 = AbstractC0423a.X(objArr, eVar3, (y2.a) K3, c0285q);
            I0.z zVar = (I0.z) X3.getValue();
            c0285q.V(1947289016);
            int i14 = i9;
            boolean g3 = (i8 == 67108864) | c0285q.g(X3) | c0285q.g(interfaceC0258c02) | ((i14 & 896) == 256) | c0285q.i(i2) | ((i14 & 29360128) == 8388608) | ((i14 & 3670016) == 1048576) | c0285q.i(locale);
            Object K4 = c0285q.K();
            if (g3 || K4 == obj) {
                interfaceC0258c0 = interfaceC0258c02;
                i10 = i14;
                Object c0207v0 = new C0207v0(c0189s0, interfaceC0258c02, cVar, i2, a02, i3, locale, X3);
                c0285q.e0(c0207v0);
                K4 = c0207v0;
            } else {
                interfaceC0258c0 = interfaceC0258c02;
                i10 = i14;
            }
            y2.c cVar2 = (y2.c) K4;
            c0285q.r(false);
            V.o l4 = androidx.compose.foundation.layout.a.l(oVar, 0.0f, 0.0f, 0.0f, H2.l.V((CharSequence) interfaceC0258c0.getValue()) ^ true ? 0 : f3360b, 7);
            c0285q.V(1947290848);
            InterfaceC0258c0 interfaceC0258c03 = interfaceC0258c0;
            boolean g4 = c0285q.g(interfaceC0258c03);
            Object K5 = c0285q.K();
            if (g4 || K5 == obj) {
                K5 = new C0213w0(interfaceC0258c03, 0);
                c0285q.e0(K5);
            }
            c0285q.r(false);
            int i15 = i10 << 6;
            R2.a(zVar, cVar2, A0.m.b(l4, false, (y2.c) K5), false, false, null, eVar, eVar2, null, null, null, null, R.b.b(c0285q, -591991974, new C0018a(1, interfaceC0258c03)), !H2.l.V((CharSequence) interfaceC0258c03.getValue()), new C1(c0189s0), new z.Q(7, 17), null, true, 0, 0, null, null, b02.f1338y, c0285q, (i15 & 3670016) | (i15 & 29360128), 12779904, 0, 4001592);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0219x0(oVar, l3, cVar, i2, eVar, eVar2, i3, a02, c0189s0, locale, b02, i4, i5);
        }
    }
}
