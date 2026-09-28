package v;

import n0.C0929h;
import p.X;
import r0.AbstractC1108W;
import r0.AbstractC1119h;
import s0.C1194h;
import s0.InterfaceC1192f;

/* renamed from: v.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1362p implements InterfaceC1192f {

    /* renamed from: g, reason: collision with root package name */
    public static final C1360n f11382g = new C1360n();

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1363q f11383b;

    /* renamed from: c, reason: collision with root package name */
    public final C0929h f11384c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11385d;

    /* renamed from: e, reason: collision with root package name */
    public final O0.k f11386e;

    /* renamed from: f, reason: collision with root package name */
    public final X f11387f;

    public C1362p(InterfaceC1363q interfaceC1363q, C0929h c0929h, boolean z3, O0.k kVar, X x2) {
        this.f11383b = interfaceC1363q;
        this.f11384c = c0929h;
        this.f11385d = z3;
        this.f11386e = kVar;
        this.f11387f = x2;
    }

    @Override // s0.InterfaceC1192f
    public final C1194h getKey() {
        return AbstractC1119h.f9871a;
    }

    @Override // s0.InterfaceC1192f
    public final Object getValue() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0029, code lost:
    
        if (r3 == p.X.f9518h) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0015, code lost:
    
        if (r3 == p.X.f9519i) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(v.C1359m r5, int r6) {
        /*
            r4 = this;
            r0 = 5
            boolean r0 = r0.AbstractC1108W.f(r6, r0)
            r1 = 0
            r2 = 1
            p.X r3 = r4.f11387f
            if (r0 == 0) goto Lc
            goto L13
        Lc:
            r0 = 6
            boolean r0 = r0.AbstractC1108W.f(r6, r0)
            if (r0 == 0) goto L18
        L13:
            p.X r0 = p.X.f9519i
            if (r3 != r0) goto L3a
            goto L2b
        L18:
            r0 = 3
            boolean r0 = r0.AbstractC1108W.f(r6, r0)
            if (r0 == 0) goto L20
            goto L27
        L20:
            r0 = 4
            boolean r0 = r0.AbstractC1108W.f(r6, r0)
            if (r0 == 0) goto L2c
        L27:
            p.X r0 = p.X.f9518h
            if (r3 != r0) goto L3a
        L2b:
            return r1
        L2c:
            boolean r0 = r0.AbstractC1108W.f(r6, r2)
            if (r0 == 0) goto L33
            goto L3a
        L33:
            r0 = 2
            boolean r0 = r0.AbstractC1108W.f(r6, r0)
            if (r0 == 0) goto L53
        L3a:
            boolean r6 = r4.m(r6)
            if (r6 == 0) goto L4d
            int r5 = r5.f11378b
            v.q r6 = r4.f11383b
            int r6 = r6.a()
            int r6 = r6 - r2
            if (r5 >= r6) goto L52
        L4b:
            r1 = r2
            goto L52
        L4d:
            int r5 = r5.f11377a
            if (r5 <= 0) goto L52
            goto L4b
        L52:
            return r1
        L53:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Lazy list does not support beyond bounds layout for the specified direction"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C1362p.l(v.m, int):boolean");
    }

    public final boolean m(int i2) {
        if (!AbstractC1108W.f(i2, 1)) {
            if (AbstractC1108W.f(i2, 2)) {
                return true;
            }
            boolean f3 = AbstractC1108W.f(i2, 5);
            boolean z3 = this.f11385d;
            if (!f3) {
                if (!AbstractC1108W.f(i2, 6)) {
                    boolean f4 = AbstractC1108W.f(i2, 3);
                    O0.k kVar = this.f11386e;
                    if (f4) {
                        int ordinal = kVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                throw new J2.r();
                            }
                            if (!z3) {
                                return true;
                            }
                        }
                    } else {
                        if (!AbstractC1108W.f(i2, 4)) {
                            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
                        }
                        int ordinal2 = kVar.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                throw new J2.r();
                            }
                        } else if (!z3) {
                            return true;
                        }
                    }
                } else if (!z3) {
                    return true;
                }
            }
            return z3;
        }
        return false;
    }
}
