package u0;

import J.C0303z0;
import J2.InterfaceC0328z;
import android.view.View;
import androidx.lifecycle.InterfaceC0470t;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class j1 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f11067l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f11068m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z2.s f11069n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0303z0 f11070o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0470t f11071p;
    public final /* synthetic */ k1 q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ View f11072r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(z2.s sVar, C0303z0 c0303z0, InterfaceC0470t interfaceC0470t, k1 k1Var, View view, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11069n = sVar;
        this.f11070o = c0303z0;
        this.f11071p = interfaceC0470t;
        this.q = k1Var;
        this.f11072r = view;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((j1) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        j1 j1Var = new j1(this.f11069n, this.f11070o, this.f11071p, this.q, this.f11072r, interfaceC1073d);
        j1Var.f11068m = obj;
        return j1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r12) {
        /*
            r11 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r11.f11067l
            m2.v r2 = m2.C0880v.f8657a
            r3 = 0
            u0.k1 r4 = r11.q
            androidx.lifecycle.t r5 = r11.f11071p
            r6 = 1
            if (r1 == 0) goto L24
            if (r1 != r6) goto L1c
            java.lang.Object r0 = r11.f11068m
            J2.Z r0 = (J2.Z) r0
            C1.y.J(r12)     // Catch: java.lang.Throwable -> L19
            goto L8f
        L19:
            r12 = move-exception
            goto La2
        L1c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L24:
            C1.y.J(r12)
            java.lang.Object r12 = r11.f11068m
            J2.z r12 = (J2.InterfaceC0328z) r12
            z2.s r1 = r11.f11069n     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r1 = r1.f11909h     // Catch: java.lang.Throwable -> L5e
            u0.B0 r1 = (u0.B0) r1     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L60
            android.view.View r7 = r11.f11072r     // Catch: java.lang.Throwable -> L5e
            android.content.Context r7 = r7.getContext()     // Catch: java.lang.Throwable -> L5e
            android.content.Context r7 = r7.getApplicationContext()     // Catch: java.lang.Throwable -> L5e
            M2.b0 r7 = u0.n1.a(r7)     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r8 = r7.getValue()     // Catch: java.lang.Throwable -> L5e
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L5e
            float r8 = r8.floatValue()     // Catch: java.lang.Throwable -> L5e
            J.g0 r9 = r1.f10827h     // Catch: java.lang.Throwable -> L5e
            r9.h(r8)     // Catch: java.lang.Throwable -> L5e
            u0.i1 r8 = new u0.i1     // Catch: java.lang.Throwable -> L5e
            r8.<init>(r7, r1, r3)     // Catch: java.lang.Throwable -> L5e
            r1 = 0
            r7 = 3
            J2.p0 r12 = J2.B.r(r12, r3, r1, r8, r7)     // Catch: java.lang.Throwable -> L5e
            goto L61
        L5c:
            r0 = r3
            goto La2
        L5e:
            r12 = move-exception
            goto L5c
        L60:
            r12 = r3
        L61:
            J.z0 r1 = r11.f11070o     // Catch: java.lang.Throwable -> La0
            r11.f11068m = r12     // Catch: java.lang.Throwable -> La0
            r11.f11067l = r6     // Catch: java.lang.Throwable -> La0
            r1.getClass()     // Catch: java.lang.Throwable -> La0
            J.y0 r6 = new J.y0     // Catch: java.lang.Throwable -> La0
            r6.<init>(r1, r3)     // Catch: java.lang.Throwable -> La0
            q2.i r7 = r11.f10205i     // Catch: java.lang.Throwable -> La0
            z2.h.c(r7)     // Catch: java.lang.Throwable -> La0
            J.X r7 = J.C0257c.H(r7)     // Catch: java.lang.Throwable -> La0
            J.x0 r8 = new J.x0     // Catch: java.lang.Throwable -> La0
            r8.<init>(r1, r6, r7, r3)     // Catch: java.lang.Throwable -> La0
            J.g r1 = r1.f4301a     // Catch: java.lang.Throwable -> La0
            java.lang.Object r1 = J2.B.z(r1, r8, r11)     // Catch: java.lang.Throwable -> La0
            if (r1 != r0) goto L86
            goto L87
        L86:
            r1 = r2
        L87:
            if (r1 != r0) goto L8a
            goto L8b
        L8a:
            r1 = r2
        L8b:
            if (r1 != r0) goto L8e
            return r0
        L8e:
            r0 = r12
        L8f:
            if (r0 == 0) goto L94
            r0.a(r3)
        L94:
            androidx.lifecycle.v r12 = r5.e()
            r12.f(r4)
            return r2
        L9c:
            r10 = r0
            r0 = r12
            r12 = r10
            goto La2
        La0:
            r0 = move-exception
            goto L9c
        La2:
            if (r0 == 0) goto La7
            r0.a(r3)
        La7:
            androidx.lifecycle.v r0 = r5.e()
            r0.f(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.j1.p(java.lang.Object):java.lang.Object");
    }
}
