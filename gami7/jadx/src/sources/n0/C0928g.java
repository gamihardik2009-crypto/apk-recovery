package n0;

import j.AbstractC0758n;
import j.C0757m;
import java.util.ArrayList;
import java.util.List;
import k.AbstractC0779a;
import n2.C0970v;
import r0.InterfaceC1129r;
import t0.AbstractC1248f;
import t0.AbstractC1256n;
import t0.Z;
import t0.k0;

/* renamed from: n0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0928g extends C0929h {

    /* renamed from: b, reason: collision with root package name */
    public final V.n f8934b;

    /* renamed from: c, reason: collision with root package name */
    public final O.m f8935c;

    /* renamed from: d, reason: collision with root package name */
    public final C0757m f8936d;

    /* renamed from: e, reason: collision with root package name */
    public Z f8937e;

    /* renamed from: f, reason: collision with root package name */
    public C0930i f8938f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8939g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8940h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8941i;

    public C0928g(V.n nVar) {
        super(0);
        this.f8934b = nVar;
        O.m mVar = new O.m();
        mVar.f5121b = new long[2];
        this.f8935c = mVar;
        this.f8936d = new C0757m(2);
        this.f8940h = true;
        this.f8941i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [V.n] */
    /* JADX WARN: Type inference failed for: r5v1, types: [V.n] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49, types: [V.n] */
    /* JADX WARN: Type inference failed for: r5v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [L.d] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [L.d] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // n0.C0929h
    public final boolean a(C0757m c0757m, InterfaceC1129r interfaceC1129r, B.z zVar, boolean z3) {
        C0757m c0757m2;
        O.m mVar;
        Object obj;
        boolean z4;
        boolean z5;
        boolean z6;
        C0930i c0930i;
        boolean z7;
        int i2;
        int i3;
        int i4;
        long j3;
        List list;
        boolean a3 = super.a(c0757m, interfaceC1129r, zVar, z3);
        AbstractC1256n abstractC1256n = this.f8934b;
        if (!abstractC1256n.f5869t) {
            return true;
        }
        ?? r8 = 0;
        while (abstractC1256n != 0) {
            if (abstractC1256n instanceof k0) {
                this.f8937e = AbstractC1248f.t((k0) abstractC1256n, 16);
            } else if ((abstractC1256n.f5860j & 16) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                V.n nVar = abstractC1256n.f10608v;
                int i5 = 0;
                abstractC1256n = abstractC1256n;
                r8 = r8;
                while (nVar != null) {
                    if ((nVar.f5860j & 16) != 0) {
                        i5++;
                        r8 = r8;
                        if (i5 == 1) {
                            abstractC1256n = nVar;
                        } else {
                            if (r8 == 0) {
                                r8 = new L.d(new V.n[16]);
                            }
                            if (abstractC1256n != 0) {
                                r8.b(abstractC1256n);
                                abstractC1256n = 0;
                            }
                            r8.b(nVar);
                        }
                    }
                    nVar = nVar.f5863m;
                    abstractC1256n = abstractC1256n;
                    r8 = r8;
                }
                if (i5 == 1) {
                }
            }
            abstractC1256n = AbstractC1248f.f(r8);
        }
        int c3 = c0757m.c();
        int i6 = 0;
        while (true) {
            c0757m2 = this.f8936d;
            mVar = this.f8935c;
            if (i6 >= c3) {
                break;
            }
            long a4 = c0757m.a(i6);
            r rVar = (r) c0757m.d(i6);
            if (mVar.b(a4)) {
                long j4 = rVar.f8963g;
                if (b0.c.f(j4)) {
                    long j5 = rVar.f8959c;
                    if (b0.c.f(j5)) {
                        List list2 = rVar.f8967k;
                        C0970v c0970v = C0970v.f9165h;
                        if (list2 == null) {
                            list2 = c0970v;
                        }
                        ArrayList arrayList = new ArrayList(list2.size());
                        List list3 = rVar.f8967k;
                        i2 = c3;
                        if (list3 == null) {
                            list3 = c0970v;
                        }
                        int size = list3.size();
                        z7 = a3;
                        int i7 = 0;
                        while (i7 < size) {
                            int i8 = size;
                            C0925d c0925d = (C0925d) list3.get(i7);
                            long j6 = a4;
                            long j7 = c0925d.f8925b;
                            if (b0.c.f(j7)) {
                                list = list3;
                                Z z8 = this.f8937e;
                                z2.h.c(z8);
                                long b12 = z8.b1(interfaceC1129r, j7);
                                i4 = i6;
                                j3 = j5;
                                arrayList.add(new C0925d(c0925d.f8924a, b12, c0925d.f8926c));
                            } else {
                                i4 = i6;
                                j3 = j5;
                                list = list3;
                            }
                            i7++;
                            i6 = i4;
                            list3 = list;
                            size = i8;
                            j5 = j3;
                            a4 = j6;
                        }
                        i3 = i6;
                        Z z9 = this.f8937e;
                        z2.h.c(z9);
                        long b13 = z9.b1(interfaceC1129r, j4);
                        Z z10 = this.f8937e;
                        z2.h.c(z10);
                        r rVar2 = new r(rVar.f8957a, rVar.f8958b, z10.b1(interfaceC1129r, j5), rVar.f8960d, rVar.f8961e, rVar.f8962f, b13, rVar.f8964h, rVar.f8965i, arrayList, rVar.f8966j, rVar.f8968l);
                        rVar2.f8969m = rVar.f8969m;
                        c0757m2.b(a4, rVar2);
                        i6 = i3 + 1;
                        c3 = i2;
                        a3 = z7;
                    }
                }
            }
            z7 = a3;
            i2 = c3;
            i3 = i6;
            i6 = i3 + 1;
            c3 = i2;
            a3 = z7;
        }
        boolean z11 = a3;
        if (c0757m2.c() == 0) {
            mVar.f5120a = 0;
            this.f8942a.g();
            return true;
        }
        for (int i9 = mVar.f5120a - 1; -1 < i9; i9--) {
            long j8 = ((long[]) mVar.f5121b)[i9];
            if (c0757m.f8008h) {
                int i10 = c0757m.f8011k;
                long[] jArr = c0757m.f8009i;
                Object[] objArr = c0757m.f8010j;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj2 = objArr[i12];
                    if (obj2 != AbstractC0758n.f8012a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj2;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                c0757m.f8008h = false;
                c0757m.f8011k = i11;
            }
            if (AbstractC0779a.b(c0757m.f8009i, c0757m.f8011k, j8) < 0) {
                mVar.c(i9);
            }
        }
        ArrayList arrayList2 = new ArrayList(c0757m2.c());
        int c4 = c0757m2.c();
        for (int i13 = 0; i13 < c4; i13++) {
            arrayList2.add(c0757m2.d(i13));
        }
        C0930i c0930i2 = new C0930i(arrayList2, zVar);
        int size2 = arrayList2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList2.get(i14);
            if (zVar.a(((r) obj).f8957a)) {
                break;
            }
            i14++;
        }
        r rVar3 = (r) obj;
        if (rVar3 != null) {
            boolean z12 = rVar3.f8960d;
            if (z3) {
                z4 = false;
                if (!this.f8940h && (z12 || rVar3.f8964h)) {
                    Z z13 = this.f8937e;
                    z2.h.c(z13);
                    boolean f3 = AbstractC0937p.f(rVar3, z13.f9836j);
                    z5 = true;
                    this.f8940h = !f3;
                    if (this.f8940h == this.f8939g && (AbstractC0937p.d(c0930i2.f8945c, 3) || AbstractC0937p.d(c0930i2.f8945c, 4) || AbstractC0937p.d(c0930i2.f8945c, 5))) {
                        c0930i2.f8945c = this.f8940h ? 4 : 5;
                    } else if (!AbstractC0937p.d(c0930i2.f8945c, 4) && this.f8939g && !this.f8941i) {
                        c0930i2.f8945c = 3;
                    } else if (AbstractC0937p.d(c0930i2.f8945c, 5) && this.f8940h && z12) {
                        c0930i2.f8945c = 3;
                    }
                }
            } else {
                z4 = false;
                this.f8940h = false;
            }
            z5 = true;
            if (this.f8940h == this.f8939g) {
            }
            if (!AbstractC0937p.d(c0930i2.f8945c, 4)) {
            }
            if (AbstractC0937p.d(c0930i2.f8945c, 5)) {
                c0930i2.f8945c = 3;
            }
        } else {
            z4 = false;
            z5 = true;
        }
        if (!z11 && AbstractC0937p.d(c0930i2.f8945c, 3) && (c0930i = this.f8938f) != null) {
            ?? r12 = c0930i.f8943a;
            int size3 = r12.size();
            ?? r5 = c0930i2.f8943a;
            if (size3 == r5.size()) {
                int size4 = r5.size();
                for (?? r7 = z4; r7 < size4; r7++) {
                    if (b0.c.b(((r) r12.get(r7)).f8959c, ((r) r5.get(r7)).f8959c)) {
                    }
                }
                z6 = z4;
                this.f8938f = c0930i2;
                return z6;
            }
        }
        z6 = z5;
        this.f8938f = c0930i2;
        return z6;
    }

    @Override // n0.C0929h
    public final void c(B.z zVar) {
        super.c(zVar);
        C0930i c0930i = this.f8938f;
        if (c0930i == null) {
            return;
        }
        this.f8939g = this.f8940h;
        List list = c0930i.f8943a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            r rVar = (r) list.get(i2);
            boolean z3 = !rVar.f8960d;
            long j3 = rVar.f8957a;
            boolean z4 = !zVar.a(j3);
            boolean z5 = !this.f8940h;
            if ((z3 && z4) || (z3 && z5)) {
                O.m mVar = this.f8935c;
                int i3 = mVar.f5120a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        break;
                    }
                    if (j3 == ((long[]) mVar.f5121b)[i4]) {
                        mVar.c(i4);
                        break;
                    }
                    i4++;
                }
            }
        }
        this.f8940h = false;
        this.f8941i = AbstractC0937p.d(c0930i.f8945c, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [V.n] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [V.n] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [V.n] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [L.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [L.d] */
    public final void f() {
        L.d dVar = this.f8942a;
        int i2 = dVar.f4620j;
        if (i2 > 0) {
            Object[] objArr = dVar.f4618h;
            int i3 = 0;
            do {
                ((C0928g) objArr[i3]).f();
                i3++;
            } while (i3 < i2);
        }
        AbstractC1256n abstractC1256n = this.f8934b;
        ?? r4 = 0;
        while (abstractC1256n != 0) {
            if (abstractC1256n instanceof k0) {
                ((k0) abstractC1256n).Y();
            } else if ((abstractC1256n.f5860j & 16) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                V.n nVar = abstractC1256n.f10608v;
                int i4 = 0;
                abstractC1256n = abstractC1256n;
                r4 = r4;
                while (nVar != null) {
                    if ((nVar.f5860j & 16) != 0) {
                        i4++;
                        r4 = r4;
                        if (i4 == 1) {
                            abstractC1256n = nVar;
                        } else {
                            if (r4 == 0) {
                                r4 = new L.d(new V.n[16]);
                            }
                            if (abstractC1256n != 0) {
                                r4.b(abstractC1256n);
                                abstractC1256n = 0;
                            }
                            r4.b(nVar);
                        }
                    }
                    nVar = nVar.f5863m;
                    abstractC1256n = abstractC1256n;
                    r4 = r4;
                }
                if (i4 == 1) {
                }
            }
            abstractC1256n = AbstractC1248f.f(r4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0092 A[LOOP:0: B:8:0x0090->B:9:0x0092, LOOP_END] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [V.n] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [V.n] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [L.d] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [L.d] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(B.z r15) {
        /*
            r14 = this;
            j.m r0 = r14.f8936d
            int r1 = r0.c()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto Lc
            r1 = r3
            goto Ld
        Lc:
            r1 = r2
        Ld:
            r4 = 0
            if (r1 == 0) goto L13
        L10:
            r3 = r2
            goto L88
        L13:
            V.n r1 = r14.f8934b
            boolean r5 = r1.f5869t
            if (r5 != 0) goto L1a
            goto L10
        L1a:
            n0.i r5 = r14.f8938f
            z2.h.c(r5)
            t0.Z r6 = r14.f8937e
            z2.h.c(r6)
            long r6 = r6.f9836j
            r8 = r1
            r9 = r4
        L28:
            if (r8 == 0) goto L71
            boolean r10 = r8 instanceof t0.k0
            if (r10 == 0) goto L36
            t0.k0 r8 = (t0.k0) r8
            n0.j r10 = n0.EnumC0931j.f8948j
            r8.t0(r5, r10, r6)
            goto L6c
        L36:
            int r10 = r8.f5860j
            r11 = 16
            r10 = r10 & r11
            if (r10 == 0) goto L6c
            boolean r10 = r8 instanceof t0.AbstractC1256n
            if (r10 == 0) goto L6c
            r10 = r8
            t0.n r10 = (t0.AbstractC1256n) r10
            V.n r10 = r10.f10608v
            r12 = r2
        L47:
            if (r10 == 0) goto L69
            int r13 = r10.f5860j
            r13 = r13 & r11
            if (r13 == 0) goto L66
            int r12 = r12 + 1
            if (r12 != r3) goto L54
            r8 = r10
            goto L66
        L54:
            if (r9 != 0) goto L5d
            L.d r9 = new L.d
            V.n[] r13 = new V.n[r11]
            r9.<init>(r13)
        L5d:
            if (r8 == 0) goto L63
            r9.b(r8)
            r8 = r4
        L63:
            r9.b(r10)
        L66:
            V.n r10 = r10.f5863m
            goto L47
        L69:
            if (r12 != r3) goto L6c
            goto L28
        L6c:
            V.n r8 = t0.AbstractC1248f.f(r9)
            goto L28
        L71:
            boolean r1 = r1.f5869t
            if (r1 == 0) goto L88
            L.d r1 = r14.f8942a
            int r5 = r1.f4620j
            if (r5 <= 0) goto L88
            java.lang.Object[] r1 = r1.f4618h
            r6 = r2
        L7e:
            r7 = r1[r6]
            n0.g r7 = (n0.C0928g) r7
            r7.g(r15)
            int r6 = r6 + r3
            if (r6 < r5) goto L7e
        L88:
            r14.c(r15)
            int r15 = r0.f8011k
            java.lang.Object[] r1 = r0.f8010j
            r5 = r2
        L90:
            if (r5 >= r15) goto L97
            r1[r5] = r4
            int r5 = r5 + 1
            goto L90
        L97:
            r0.f8011k = r2
            r0.f8008h = r2
            r14.f8937e = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.C0928g.g(B.z):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [V.n] */
    /* JADX WARN: Type inference failed for: r0v5, types: [V.n] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [V.n] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [L.d] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [L.d] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [V.n] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [V.n] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [L.d] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [L.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean h(B.z zVar, boolean z3) {
        L.d dVar;
        int i2;
        if (this.f8936d.c() == 0) {
            return false;
        }
        AbstractC1256n abstractC1256n = this.f8934b;
        if (!abstractC1256n.f5869t) {
            return false;
        }
        C0930i c0930i = this.f8938f;
        z2.h.c(c0930i);
        Z z4 = this.f8937e;
        z2.h.c(z4);
        long j3 = z4.f9836j;
        AbstractC1256n abstractC1256n2 = abstractC1256n;
        ?? r8 = 0;
        while (abstractC1256n2 != 0) {
            if (abstractC1256n2 instanceof k0) {
                ((k0) abstractC1256n2).t0(c0930i, EnumC0931j.f8946h, j3);
            } else if ((abstractC1256n2.f5860j & 16) != 0 && (abstractC1256n2 instanceof AbstractC1256n)) {
                V.n nVar = abstractC1256n2.f10608v;
                int i3 = 0;
                abstractC1256n2 = abstractC1256n2;
                r8 = r8;
                while (nVar != null) {
                    if ((nVar.f5860j & 16) != 0) {
                        i3++;
                        r8 = r8;
                        if (i3 == 1) {
                            abstractC1256n2 = nVar;
                        } else {
                            if (r8 == 0) {
                                r8 = new L.d(new V.n[16]);
                            }
                            if (abstractC1256n2 != 0) {
                                r8.b(abstractC1256n2);
                                abstractC1256n2 = 0;
                            }
                            r8.b(nVar);
                        }
                    }
                    nVar = nVar.f5863m;
                    abstractC1256n2 = abstractC1256n2;
                    r8 = r8;
                }
                if (i3 == 1) {
                }
            }
            abstractC1256n2 = AbstractC1248f.f(r8);
        }
        if (abstractC1256n.f5869t && (i2 = (dVar = this.f8942a).f4620j) > 0) {
            Object[] objArr = dVar.f4618h;
            int i4 = 0;
            do {
                C0928g c0928g = (C0928g) objArr[i4];
                z2.h.c(this.f8937e);
                c0928g.h(zVar, z3);
                i4++;
            } while (i4 < i2);
        }
        if (abstractC1256n.f5869t) {
            ?? r14 = 0;
            while (abstractC1256n != 0) {
                if (abstractC1256n instanceof k0) {
                    ((k0) abstractC1256n).t0(c0930i, EnumC0931j.f8947i, j3);
                } else if ((abstractC1256n.f5860j & 16) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                    V.n nVar2 = abstractC1256n.f10608v;
                    int i5 = 0;
                    abstractC1256n = abstractC1256n;
                    r14 = r14;
                    while (nVar2 != null) {
                        if ((nVar2.f5860j & 16) != 0) {
                            i5++;
                            r14 = r14;
                            if (i5 == 1) {
                                abstractC1256n = nVar2;
                            } else {
                                if (r14 == 0) {
                                    r14 = new L.d(new V.n[16]);
                                }
                                if (abstractC1256n != 0) {
                                    r14.b(abstractC1256n);
                                    abstractC1256n = 0;
                                }
                                r14.b(nVar2);
                            }
                        }
                        nVar2 = nVar2.f5863m;
                        abstractC1256n = abstractC1256n;
                        r14 = r14;
                    }
                    if (i5 == 1) {
                    }
                }
                abstractC1256n = AbstractC1248f.f(r14);
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r5 >= 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(long r9, j.C0767w r11) {
        /*
            r8 = this;
            O.m r0 = r8.f8935c
            boolean r1 = r0.b(r9)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L4d
            java.lang.Object[] r1 = r11.f8057a
            int r4 = r11.f8058b
            r5 = r2
        Lf:
            if (r5 >= r4) goto L1f
            r6 = r1[r5]
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L1c
            if (r5 < 0) goto L1f
            goto L4d
        L1c:
            int r5 = r5 + 1
            goto Lf
        L1f:
            int r1 = r0.f5120a
            r4 = r2
        L22:
            if (r4 >= r1) goto L35
            java.lang.Object r5 = r0.f5121b
            long[] r5 = (long[]) r5
            r6 = r5[r4]
            int r5 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r5 != 0) goto L32
            r0.c(r4)
            goto L35
        L32:
            int r4 = r4 + 1
            goto L22
        L35:
            j.m r0 = r8.f8936d
            long[] r1 = r0.f8009i
            int r4 = r0.f8011k
            int r1 = k.AbstractC0779a.b(r1, r4, r9)
            if (r1 < 0) goto L4d
            java.lang.Object[] r4 = r0.f8010j
            r5 = r4[r1]
            java.lang.Object r6 = j.AbstractC0758n.f8012a
            if (r5 == r6) goto L4d
            r4[r1] = r6
            r0.f8008h = r3
        L4d:
            L.d r0 = r8.f8942a
            int r1 = r0.f4620j
            if (r1 <= 0) goto L5f
            java.lang.Object[] r0 = r0.f4618h
        L55:
            r4 = r0[r2]
            n0.g r4 = (n0.C0928g) r4
            r4.i(r9, r11)
            int r2 = r2 + r3
            if (r2 < r1) goto L55
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.C0928g.i(long, j.w):void");
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.f8934b + ", children=" + this.f8942a + ", pointerIds=" + this.f8935c + ')';
    }
}
