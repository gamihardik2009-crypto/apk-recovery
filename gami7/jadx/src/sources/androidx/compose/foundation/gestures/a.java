package androidx.compose.foundation.gestures;

import V.o;
import n.j0;
import p.C1016f0;
import p.C1018g0;
import p.C1020h0;
import p.InterfaceC1013e;
import p.InterfaceC1047v0;
import p.U;
import p.X;
import r.l;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1018g0 f6606a = new C1018g0();

    /* renamed from: b, reason: collision with root package name */
    public static final C1016f0 f6607b = new C1016f0();

    /* renamed from: c, reason: collision with root package name */
    public static final C1020h0 f6608c = new C1020h0();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(p.C0 r11, long r12, q2.InterfaceC1073d r14) {
        /*
            boolean r0 = r14 instanceof p.C1022i0
            if (r0 == 0) goto L13
            r0 = r14
            p.i0 r0 = (p.C1022i0) r0
            int r1 = r0.f9606n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9606n = r1
            goto L18
        L13:
            p.i0 r0 = new p.i0
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f9605m
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f9606n
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            z2.p r11 = r0.f9604l
            p.C0 r12 = r0.f9603k
            C1.y.J(r14)
            r14 = r11
            r11 = r12
            goto L56
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            C1.y.J(r14)
            z2.p r14 = new z2.p
            r14.<init>()
            n.c0 r2 = n.c0.f8753h
            p.j0 r10 = new p.j0
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r12
            r8 = r14
            r4.<init>(r5, r6, r8, r9)
            r0.f9603k = r11
            r0.f9604l = r14
            r0.f9606n = r3
            java.lang.Object r12 = r11.e(r2, r10, r0)
            if (r12 != r1) goto L56
            goto L61
        L56:
            float r12 = r14.f11906h
            long r11 = r11.g(r12)
            b0.c r1 = new b0.c
            r1.<init>(r11)
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.a(p.C0, long, q2.d):java.lang.Object");
    }

    public static final o b(o oVar, InterfaceC1047v0 interfaceC1047v0, X x2, j0 j0Var, boolean z3, boolean z4, U u3, l lVar, InterfaceC1013e interfaceC1013e) {
        return oVar.k(new ScrollableElement(j0Var, interfaceC1013e, u3, x2, interfaceC1047v0, lVar, z3, z4));
    }
}
