package L2;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class o extends O2.t {

    /* renamed from: l, reason: collision with root package name */
    public final g f4740l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReferenceArray f4741m;

    public o(long j3, o oVar, g gVar, int i2) {
        super(j3, oVar, i2);
        this.f4740l = gVar;
        this.f4741m = new AtomicReferenceArray(i.f4717b * 2);
    }

    @Override // O2.t
    public final int f() {
        return i.f4717b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005e, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0060, code lost:
    
        z2.h.c(r5);
        r7 = r5.f4713i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0065, code lost:
    
        if (r7 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0067, code lost:
    
        r7 = O2.AbstractC0369a.a(r7, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x006b, code lost:
    
        if (r7 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006d, code lost:
    
        J2.B.m(r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return;
     */
    @Override // O2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r7, q2.InterfaceC1078i r8) {
        /*
            r6 = this;
            int r0 = L2.i.f4717b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f4741m
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.k(r7)
            boolean r3 = r2 instanceof J2.w0
            r4 = 0
            L2.g r5 = r6.f4740l
            if (r3 != 0) goto L71
            boolean r3 = r2 instanceof L2.y
            if (r3 == 0) goto L22
            goto L71
        L22:
            O2.v r3 = L2.i.f4725j
            if (r2 == r3) goto L5b
            O2.v r3 = L2.i.f4726k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            O2.v r3 = L2.i.f4722g
            if (r2 == r3) goto L12
            O2.v r3 = L2.i.f4721f
            if (r2 != r3) goto L34
            goto L12
        L34:
            O2.v r7 = L2.i.f4724i
            if (r2 == r7) goto L5a
            O2.v r7 = L2.i.f4719d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            O2.v r7 = L2.i.f4727l
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.m(r7, r4)
            if (r1 == 0) goto L70
            z2.h.c(r5)
            y2.c r7 = r5.f4713i
            if (r7 == 0) goto L70
            J2.r r7 = O2.AbstractC0369a.a(r7, r0, r4)
            if (r7 == 0) goto L70
            J2.B.m(r7, r8)
        L70:
            return
        L71:
            if (r1 == 0) goto L76
            O2.v r3 = L2.i.f4725j
            goto L78
        L76:
            O2.v r3 = L2.i.f4726k
        L78:
            boolean r2 = r6.j(r2, r7, r3)
            if (r2 == 0) goto L12
            r6.m(r7, r4)
            r2 = r1 ^ 1
            r6.l(r7, r2)
            if (r1 == 0) goto L98
            z2.h.c(r5)
            y2.c r7 = r5.f4713i
            if (r7 == 0) goto L98
            J2.r r7 = O2.AbstractC0369a.a(r7, r0, r4)
            if (r7 == 0) goto L98
            J2.B.m(r7, r8)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.o.g(int, q2.i):void");
    }

    public final boolean j(Object obj, int i2, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f4741m;
        int i3 = (i2 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
            if (atomicReferenceArray.get(i3) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i2) {
        return this.f4741m.get((i2 * 2) + 1);
    }

    public final void l(int i2, boolean z3) {
        if (z3) {
            g gVar = this.f4740l;
            z2.h.c(gVar);
            gVar.L((this.f5206j * i.f4717b) + i2);
        }
        h();
    }

    public final void m(int i2, Object obj) {
        this.f4741m.lazySet(i2 * 2, obj);
    }

    public final void n(int i2, O2.v vVar) {
        this.f4741m.set((i2 * 2) + 1, vVar);
    }
}
