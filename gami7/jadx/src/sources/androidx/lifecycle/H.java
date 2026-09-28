package androidx.lifecycle;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class H extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public z2.s f6832l;

    /* renamed from: m, reason: collision with root package name */
    public z2.s f6833m;

    /* renamed from: n, reason: collision with root package name */
    public int f6834n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0472v f6835o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ EnumC0466o f6836p;
    public final /* synthetic */ InterfaceC0328z q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y2.e f6837r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C0472v c0472v, EnumC0466o enumC0466o, InterfaceC0328z interfaceC0328z, y2.e eVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f6835o = c0472v;
        this.f6836p = enumC0466o;
        this.q = interfaceC0328z;
        this.f6837r = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((H) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new H(this.f6835o, this.f6836p, this.q, this.f6837r, interfaceC1073d);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            r2.a r0 = r2.EnumC1145a.f10026h
            int r2 = r1.f6834n
            m2.v r3 = m2.C0880v.f8657a
            androidx.lifecycle.v r5 = r1.f6835o
            r6 = 1
            if (r2 == 0) goto L23
            if (r2 != r6) goto L1b
            z2.s r2 = r1.f6833m
            z2.s r6 = r1.f6832l
            C1.y.J(r18)     // Catch: java.lang.Throwable -> L18
            goto L94
        L18:
            r0 = move-exception
            goto Lab
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L23:
            C1.y.J(r18)
            androidx.lifecycle.o r2 = r5.f6909c
            androidx.lifecycle.o r7 = androidx.lifecycle.EnumC0466o.f6898h
            if (r2 != r7) goto L2d
            return r3
        L2d:
            z2.s r2 = new z2.s
            r2.<init>()
            z2.s r7 = new z2.s
            r7.<init>()
            androidx.lifecycle.o r8 = r1.f6836p     // Catch: java.lang.Throwable -> La8
            J2.z r11 = r1.q     // Catch: java.lang.Throwable -> La8
            y2.e r15 = r1.f6837r     // Catch: java.lang.Throwable -> La8
            r1.f6832l = r2     // Catch: java.lang.Throwable -> La8
            r1.f6833m = r7     // Catch: java.lang.Throwable -> La8
            r1.f6834n = r6     // Catch: java.lang.Throwable -> La8
            J2.h r14 = new J2.h     // Catch: java.lang.Throwable -> La8
            q2.d r9 = n2.AbstractC0948C.i(r17)     // Catch: java.lang.Throwable -> La8
            r14.<init>(r6, r9)     // Catch: java.lang.Throwable -> La8
            r14.r()     // Catch: java.lang.Throwable -> La8
            androidx.lifecycle.l r6 = androidx.lifecycle.EnumC0465n.Companion     // Catch: java.lang.Throwable -> La8
            r6.getClass()     // Catch: java.lang.Throwable -> La8
            java.lang.String r6 = "state"
            z2.h.f(r8, r6)     // Catch: java.lang.Throwable -> La8
            int r6 = r8.ordinal()     // Catch: java.lang.Throwable -> La8
            r9 = 2
            if (r6 == r9) goto L6f
            r9 = 3
            if (r6 == r9) goto L6c
            r9 = 4
            if (r6 == r9) goto L68
            r9 = 0
            goto L72
        L68:
            androidx.lifecycle.n r6 = androidx.lifecycle.EnumC0465n.ON_RESUME     // Catch: java.lang.Throwable -> La8
        L6a:
            r9 = r6
            goto L72
        L6c:
            androidx.lifecycle.n r6 = androidx.lifecycle.EnumC0465n.ON_START     // Catch: java.lang.Throwable -> La8
            goto L6a
        L6f:
            androidx.lifecycle.n r6 = androidx.lifecycle.EnumC0465n.ON_CREATE     // Catch: java.lang.Throwable -> La8
            goto L6a
        L72:
            androidx.lifecycle.n r12 = androidx.lifecycle.C0463l.a(r8)     // Catch: java.lang.Throwable -> La8
            S2.d r6 = S2.e.a()     // Catch: java.lang.Throwable -> La8
            androidx.lifecycle.G r13 = new androidx.lifecycle.G     // Catch: java.lang.Throwable -> La8
            r8 = r13
            r10 = r2
            r4 = r13
            r13 = r14
            r16 = r14
            r14 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> La8
            r7.f11909h = r4     // Catch: java.lang.Throwable -> La8
            r5.a(r4)     // Catch: java.lang.Throwable -> La8
            java.lang.Object r4 = r16.q()     // Catch: java.lang.Throwable -> La8
            if (r4 != r0) goto L92
            return r0
        L92:
            r6 = r2
            r2 = r7
        L94:
            java.lang.Object r0 = r6.f11909h
            J2.Z r0 = (J2.Z) r0
            if (r0 == 0) goto L9e
            r4 = 0
            r0.a(r4)
        L9e:
            java.lang.Object r0 = r2.f11909h
            androidx.lifecycle.r r0 = (androidx.lifecycle.r) r0
            if (r0 == 0) goto La7
            r5.f(r0)
        La7:
            return r3
        La8:
            r0 = move-exception
            r6 = r2
            r2 = r7
        Lab:
            java.lang.Object r3 = r6.f11909h
            J2.Z r3 = (J2.Z) r3
            if (r3 == 0) goto Lb5
            r4 = 0
            r3.a(r4)
        Lb5:
            java.lang.Object r2 = r2.f11909h
            androidx.lifecycle.r r2 = (androidx.lifecycle.r) r2
            if (r2 == 0) goto Lbe
            r5.f(r2)
        Lbe:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.H.p(java.lang.Object):java.lang.Object");
    }
}
