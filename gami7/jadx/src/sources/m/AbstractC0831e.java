package m;

import D.C0053w;
import J.C0257c;
import m2.C0880v;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import r2.EnumC1145a;
import u0.C1317w0;

/* renamed from: m.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0831e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0842o f8436a = new C0842o(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static final C0843p f8437b = new C0843p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    public static final C0844q f8438c = new C0844q(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final r f8439d = new r(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    public static final C0842o f8440e = new C0842o(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    public static final C0843p f8441f = new C0843p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    public static final C0844q f8442g = new C0844q(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    public static final r f8443h = new r(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static C0829d a(float f3) {
        return new C0829d(Float.valueOf(f3), y0.f8602a, Float.valueOf(0.01f), 8);
    }

    public static C0841n b(float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new C0841n(y0.f8602a, Float.valueOf(0.0f), new C0842o(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7 A[Catch: CancellationException -> 0x003a, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x003a, blocks: (B:13:0x0036, B:16:0x00d2, B:18:0x00e7), top: B:12:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(m.C0841n r24, m.InterfaceC0836i r25, long r26, y2.c r28, q2.InterfaceC1073d r29) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.AbstractC0831e.c(m.n, m.i, long, y2.c, q2.d):java.lang.Object");
    }

    public static Object d(float f3, float f4, InterfaceC0840m interfaceC0840m, y2.e eVar, InterfaceC1073d interfaceC1073d, int i2) {
        InterfaceC0840m m3 = (i2 & 8) != 0 ? m(0.0f, null, 7) : interfaceC0840m;
        x0 x0Var = y0.f8602a;
        Float f5 = new Float(f3);
        Float f6 = new Float(f4);
        C0842o c0842o = new C0842o(new Float(0.0f).floatValue());
        Object c3 = c(new C0841n(x0Var, f5, c0842o, 56), new h0(m3, x0Var, f5, f6, c0842o), Long.MIN_VALUE, new C0053w(eVar), interfaceC1073d);
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        C0880v c0880v = C0880v.f8657a;
        if (c3 != enumC1145a) {
            c3 = c0880v;
        }
        return c3 == enumC1145a ? c3 : c0880v;
    }

    public static final Object e(C0841n c0841n, C0850x c0850x, boolean z3, y2.c cVar, InterfaceC1073d interfaceC1073d) {
        Object c3 = c(c0841n, new C0849w(c0850x, c0841n.f8533h, c0841n.f8534i.getValue(), c0841n.f8535j), z3 ? c0841n.f8536k : Long.MIN_VALUE, cVar, interfaceC1073d);
        return c3 == EnumC1145a.f10026h ? c3 : C0880v.f8657a;
    }

    public static final Object f(C0841n c0841n, Float f3, InterfaceC0840m interfaceC0840m, boolean z3, y2.c cVar, InterfaceC1073d interfaceC1073d) {
        Object c3 = c(c0841n, new h0(interfaceC0840m, c0841n.f8533h, c0841n.f8534i.getValue(), f3, c0841n.f8535j), z3 ? c0841n.f8536k : Long.MIN_VALUE, cVar, interfaceC1073d);
        return c3 == EnumC1145a.f10026h ? c3 : C0880v.f8657a;
    }

    public static /* synthetic */ Object g(C0841n c0841n, Float f3, Z z3, boolean z4, y2.c cVar, InterfaceC1073d interfaceC1073d, int i2) {
        if ((i2 & 2) != 0) {
            z3 = m(0.0f, null, 7);
        }
        Z z5 = z3;
        if ((i2 & 8) != 0) {
            cVar = g0.f8471j;
        }
        return f(c0841n, f3, z5, z4, cVar, interfaceC1073d);
    }

    public static final Object h(InterfaceC0836i interfaceC0836i, y2.c cVar, C0828c0 c0828c0) {
        if (!interfaceC0836i.a()) {
            return C0257c.H(c0828c0.n()).d(new J.Y(9, cVar), c0828c0);
        }
        InterfaceC1078i interfaceC1078i = c0828c0.f10205i;
        z2.h.c(interfaceC1078i);
        AbstractC0837j.c(interfaceC1078i.s(C1317w0.f11247h));
        z2.h.c(interfaceC1078i);
        return C0257c.H(interfaceC1078i).d(cVar, c0828c0);
    }

    public static final AbstractC0845s i(AbstractC0845s abstractC0845s) {
        AbstractC0845s c3 = abstractC0845s.c();
        int b3 = c3.b();
        for (int i2 = 0; i2 < b3; i2++) {
            c3.e(abstractC0845s.a(i2), i2);
        }
        return c3;
    }

    public static C0841n j(C0841n c0841n, float f3, float f4, int i2) {
        if ((i2 & 1) != 0) {
            f3 = ((Number) c0841n.f8534i.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f4 = ((C0842o) c0841n.f8535j).f8543a;
        }
        return new C0841n(c0841n.f8533h, Float.valueOf(f3), new C0842o(f4), c0841n.f8536k, c0841n.f8537l, c0841n.f8538m);
    }

    public static final void k(C0839l c0839l, long j3, float f3, InterfaceC0836i interfaceC0836i, C0841n c0841n, y2.c cVar) {
        long c3 = f3 == 0.0f ? interfaceC0836i.c() : (long) ((j3 - c0839l.f8510c) / f3);
        c0839l.f8514g = j3;
        c0839l.f8512e.setValue(interfaceC0836i.b(c3));
        c0839l.f8513f = interfaceC0836i.g(c3);
        if (interfaceC0836i.f(c3)) {
            c0839l.f8515h = c0839l.f8514g;
            c0839l.f8516i.setValue(Boolean.FALSE);
        }
        o(c0839l, c0841n);
        cVar.l(c0839l);
    }

    public static final float l(InterfaceC1078i interfaceC1078i) {
        V.p pVar = (V.p) interfaceC1078i.s(V.b.f5845w);
        float u3 = pVar != null ? pVar.u() : 1.0f;
        if (u3 >= 0.0f) {
            return u3;
        }
        throw new IllegalStateException("negative scale factor");
    }

    public static Z m(float f3, Object obj, int i2) {
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new Z(1.0f, f3, obj);
    }

    public static w0 n(int i2, int i3, InterfaceC0851y interfaceC0851y, int i4) {
        if ((i4 & 1) != 0) {
            i2 = 300;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            interfaceC0851y = AbstractC0852z.f8611a;
        }
        return new w0(i2, i3, interfaceC0851y);
    }

    public static final void o(C0839l c0839l, C0841n c0841n) {
        c0841n.f8534i.setValue(c0839l.f8512e.getValue());
        AbstractC0845s abstractC0845s = c0841n.f8535j;
        AbstractC0845s abstractC0845s2 = c0839l.f8513f;
        int b3 = abstractC0845s.b();
        for (int i2 = 0; i2 < b3; i2++) {
            abstractC0845s.e(abstractC0845s2.a(i2), i2);
        }
        c0841n.f8537l = c0839l.f8515h;
        c0841n.f8536k = c0839l.f8514g;
        c0841n.f8538m = ((Boolean) c0839l.f8516i.getValue()).booleanValue();
    }
}
