package androidx.compose.ui.focus;

import D.S;
import H.C0136k1;
import H.U2;
import J.C0292u;
import J2.r;
import L.d;
import O0.k;
import V.n;
import V.o;
import a0.AbstractC0427d;
import a0.C0425b;
import a0.C0428e;
import a0.C0429f;
import a0.C0430g;
import a0.C0434k;
import a0.C0435l;
import a0.C0438o;
import a0.C0442s;
import a0.InterfaceC0431h;
import j.C0764t;
import m.AbstractC0837j;
import t0.AbstractC1248f;
import t0.AbstractC1256n;
import t0.C1236E;
import t0.n0;
import u0.C1299n;
import u0.C1301o;
import u0.C1303p;
import y2.c;
import y2.e;
import z2.h;
import z2.s;

/* loaded from: classes.dex */
public final class b implements InterfaceC0431h {

    /* renamed from: a, reason: collision with root package name */
    public final e f6741a;

    /* renamed from: b, reason: collision with root package name */
    public final c f6742b;

    /* renamed from: c, reason: collision with root package name */
    public final y2.a f6743c;

    /* renamed from: d, reason: collision with root package name */
    public final y2.a f6744d;

    /* renamed from: e, reason: collision with root package name */
    public final y2.a f6745e;

    /* renamed from: g, reason: collision with root package name */
    public final C0429f f6747g;

    /* renamed from: j, reason: collision with root package name */
    public C0764t f6750j;

    /* renamed from: f, reason: collision with root package name */
    public final C0442s f6746f = new C0442s();

    /* renamed from: h, reason: collision with root package name */
    public final S f6748h = new S(1);

    /* renamed from: i, reason: collision with root package name */
    public final o f6749i = new FocusPropertiesElement(new C0435l()).k(new t0.S() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return b.this.f6746f.hashCode();
        }

        @Override // t0.S
        public final n l() {
            return b.this.f6746f;
        }

        @Override // t0.S
        public final /* bridge */ /* synthetic */ void m(n nVar) {
        }
    });

    public b(C1299n c1299n, C1301o c1301o, C1299n c1299n2, C0428e c0428e, C0428e c0428e2, C1303p c1303p) {
        this.f6741a = c1301o;
        this.f6742b = c1299n2;
        this.f6743c = c0428e;
        this.f6744d = c0428e2;
        this.f6745e = c1303p;
        this.f6747g = new C0429f(c1299n, new C0428e(0, this, b.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0, 1));
    }

    public final boolean a(int i2, boolean z3, boolean z4) {
        boolean e3;
        int d3;
        S s3 = this.f6748h;
        C0430g c0430g = C0430g.f6463k;
        try {
            if (s3.f762b) {
                S.a(s3);
            }
            s3.f762b = true;
            ((d) s3.f764d).b(c0430g);
            C0442s c0442s = this.f6746f;
            if (!z3 && ((d3 = AbstractC0837j.d(AbstractC0427d.u(c0442s, i2))) == 1 || d3 == 2 || d3 == 3)) {
                e3 = false;
                if (e3 && z4) {
                    this.f6743c.c();
                }
                return e3;
            }
            e3 = AbstractC0427d.e(c0442s, z3, true);
            if (e3) {
                this.f6743c.c();
            }
            return e3;
        } finally {
            S.b(s3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0318, code lost:
    
        if (r7 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x00a0, code lost:
    
        if (((((~r10) << 6) & r10) & (-9187201950435737472L)) == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x00a2, code lost:
    
        r2 = r6.b(r7);
        r4 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x00aa, code lost:
    
        if (r6.f8044e != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x00bd, code lost:
    
        if (((r6.f8040a[r2 >> 3] >> ((r2 & 7) << r8)) & 255) != 254) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x00c3, code lost:
    
        r2 = r6.f8042c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x00c7, code lost:
    
        if (r2 <= 8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x00d7, code lost:
    
        if (java.lang.Long.compareUnsigned(r6.f8043d * 32, r2 * 25) > 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x00d9, code lost:
    
        r2 = r6.f8040a;
        r3 = r6.f8042c;
        r9 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x00df, code lost:
    
        if (r9 >= r3) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x00e1, code lost:
    
        r11 = r9 >> 3;
        r16 = (r9 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x00f3, code lost:
    
        if (((r2[r11] >> r16) & 255) != 254) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x00f5, code lost:
    
        r14 = r6.f8040a;
        r15 = r9;
        r14[r11] = (r14[r11] & (~(255 << r16))) | (r4 << r16);
        r8 = r6.f8042c;
        r9 = ((r15 - 7) & r8) + (r8 & 7);
        r8 = r9 >> 3;
        r9 = (r9 & 7) << 3;
        r14[r8] = (r14[r8] & (~(255 << r9))) | (128 << r9);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0128, code lost:
    
        r9 = r15 + 1;
        r4 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0127, code lost:
    
        r15 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x012e, code lost:
    
        r6.f8044e += r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0133, code lost:
    
        r35 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x01c0, code lost:
    
        r5 = r6.b(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x01c7, code lost:
    
        r6.f8043d++;
        r0 = r6.f8044e;
        r1 = r6.f8040a;
        r2 = r5 >> 3;
        r3 = r1[r2];
        r7 = (r5 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x01e2, code lost:
    
        if (((r3 >> r7) & 255) != 128) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x01e4, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x01e7, code lost:
    
        r6.f8044e = r0 - r8;
        r1[r2] = (r3 & (~(255 << r7))) | (r35 << r7);
        r0 = r6.f8042c;
        r2 = ((r5 - 7) & r0) + (r0 & 7);
        r0 = r2 >> 3;
        r2 = (r2 & 7) << 3;
        r1[r0] = (r1[r0] & (~(255 << r2))) | (r35 << r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x01e6, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0137, code lost:
    
        r2 = j.AbstractC0739E.b(r6.f8042c);
        r3 = r6.f8040a;
        r4 = r6.f8041b;
        r5 = r6.f8042c;
        r6.c(r2);
        r2 = r6.f8041b;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0149, code lost:
    
        if (r8 >= r5) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x015b, code lost:
    
        if (((r3[r8 >> 3] >> ((r8 & 7) << 3)) & 255) >= 128) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x015d, code lost:
    
        r9 = r4[r8];
        r11 = java.lang.Long.hashCode(r9) * (-862048943);
        r11 = r11 ^ (r11 << 16);
        r14 = r6.b(r11 >>> 7);
        r15 = r3;
        r16 = r4;
        r3 = r11 & 127;
        r11 = r6.f8040a;
        r17 = r14 >> 3;
        r18 = (r14 & 7) << 3;
        r11[r17] = (r11[r17] & (~(255 << r18))) | (r3 << r18);
        r0 = r6.f8042c;
        r1 = ((r14 - 7) & r0) + (r0 & 7);
        r0 = r1 >> 3;
        r1 = (r1 & 7) << 3;
        r35 = r12;
        r11[r0] = (r3 << r1) | (r11[r0] & (~(255 << r1)));
        r2[r14] = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x01b4, code lost:
    
        r8 = r8 + 1;
        r3 = r15;
        r4 = r16;
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x01af, code lost:
    
        r15 = r3;
        r16 = r4;
        r35 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x00bf, code lost:
    
        r35 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x01c6, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0298, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x029a, code lost:
    
        r12 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05ce A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0449  */
    /* JADX WARN: Type inference failed for: r0v20, types: [V.n] */
    /* JADX WARN: Type inference failed for: r0v21, types: [V.n] */
    /* JADX WARN: Type inference failed for: r0v45, types: [V.n] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r2v41, types: [V.n] */
    /* JADX WARN: Type inference failed for: r2v42, types: [V.n] */
    /* JADX WARN: Type inference failed for: r2v48, types: [V.n] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [V.n] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [V.n] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34, types: [V.n] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36, types: [V.n] */
    /* JADX WARN: Type inference failed for: r7v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.KeyEvent r38, y2.a r39) {
        /*
            Method dump skipped, instructions count: 1522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.b.b(android.view.KeyEvent, y2.a):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [L.d] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [L.d] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final Boolean c(int i2, b0.d dVar, c cVar) {
        C0442s c0442s;
        boolean a3;
        C0442s c0442s2;
        C0292u c0292u;
        C0438o c0438o;
        C0438o c0438o2;
        C0442s c0442s3 = this.f6746f;
        C0442s g3 = AbstractC0427d.g(c0442s3);
        int i3 = 4;
        y2.a aVar = this.f6745e;
        if (g3 != null) {
            k kVar = (k) aVar.c();
            C0434k K02 = g3.K0();
            if (C0425b.a(i2, 1)) {
                c0438o = K02.f6472b;
            } else if (C0425b.a(i2, 2)) {
                c0438o = K02.f6473c;
            } else if (C0425b.a(i2, 5)) {
                c0438o = K02.f6474d;
            } else if (C0425b.a(i2, 6)) {
                c0438o = K02.f6475e;
            } else if (C0425b.a(i2, 3)) {
                int ordinal = kVar.ordinal();
                if (ordinal == 0) {
                    c0438o2 = K02.f6478h;
                } else {
                    if (ordinal != 1) {
                        throw new r();
                    }
                    c0438o2 = K02.f6479i;
                }
                if (c0438o2 == C0438o.f6484b) {
                    c0438o2 = null;
                }
                if (c0438o2 == null) {
                    c0438o = K02.f6476f;
                }
                c0438o = c0438o2;
            } else if (C0425b.a(i2, 4)) {
                int ordinal2 = kVar.ordinal();
                if (ordinal2 == 0) {
                    c0438o2 = K02.f6479i;
                } else {
                    if (ordinal2 != 1) {
                        throw new r();
                    }
                    c0438o2 = K02.f6478h;
                }
                if (c0438o2 == C0438o.f6484b) {
                    c0438o2 = null;
                }
                if (c0438o2 == null) {
                    c0438o = K02.f6477g;
                }
                c0438o = c0438o2;
            } else if (C0425b.a(i2, 7)) {
                K02.f6480j.getClass();
                c0438o = C0438o.f6484b;
            } else {
                if (!C0425b.a(i2, 8)) {
                    throw new IllegalStateException("invalid FocusDirection".toString());
                }
                K02.f6481k.getClass();
                c0438o = C0438o.f6484b;
            }
            if (h.a(c0438o, C0438o.f6485c)) {
                return null;
            }
            c0442s = null;
            if (!h.a(c0438o, C0438o.f6484b)) {
                return Boolean.valueOf(c0438o.a(cVar));
            }
        } else {
            c0442s = null;
            g3 = null;
        }
        k kVar2 = (k) aVar.c();
        L2.d dVar2 = new L2.d(g3, this, cVar, 4);
        if (C0425b.a(i2, 1) || C0425b.a(i2, 2)) {
            if (C0425b.a(i2, 1)) {
                a3 = AbstractC0427d.k(c0442s3, dVar2);
            } else {
                if (!C0425b.a(i2, 2)) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                }
                a3 = AbstractC0427d.a(c0442s3, dVar2);
            }
            return Boolean.valueOf(a3);
        }
        if (C0425b.a(i2, 3) || C0425b.a(i2, 4) || C0425b.a(i2, 5) || C0425b.a(i2, 6)) {
            return AbstractC0427d.L(c0442s3, i2, dVar, dVar2);
        }
        if (C0425b.a(i2, 7)) {
            int ordinal3 = kVar2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    throw new r();
                }
                i3 = 3;
            }
            C0442s g4 = AbstractC0427d.g(c0442s3);
            return g4 != null ? AbstractC0427d.L(g4, i3, dVar, dVar2) : c0442s;
        }
        if (!C0425b.a(i2, 8)) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) C0425b.b(i2))).toString());
        }
        C0442s g5 = AbstractC0427d.g(c0442s3);
        boolean z3 = false;
        if (g5 != null) {
            n nVar = g5.f5858h;
            if (!nVar.f5869t) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            n nVar2 = nVar.f5862l;
            C1236E v3 = AbstractC1248f.v(g5);
            loop0: while (v3 != null) {
                if ((((n) v3.f10378C.f4244f).f5861k & 1024) != 0) {
                    while (nVar2 != null) {
                        if ((nVar2.f5860j & 1024) != 0) {
                            n nVar3 = nVar2;
                            ?? r6 = c0442s;
                            while (nVar3 != null) {
                                if (nVar3 instanceof C0442s) {
                                    C0442s c0442s4 = (C0442s) nVar3;
                                    if (c0442s4.K0().f6471a) {
                                        c0442s2 = c0442s4;
                                        break loop0;
                                    }
                                } else if ((nVar3.f5860j & 1024) != 0 && (nVar3 instanceof AbstractC1256n)) {
                                    n nVar4 = ((AbstractC1256n) nVar3).f10608v;
                                    int i4 = 0;
                                    r6 = r6;
                                    while (nVar4 != null) {
                                        if ((nVar4.f5860j & 1024) != 0) {
                                            i4++;
                                            r6 = r6;
                                            if (i4 == 1) {
                                                nVar3 = nVar4;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new d(new n[16]);
                                                }
                                                if (nVar3 != null) {
                                                    r6.b(nVar3);
                                                    nVar3 = c0442s;
                                                }
                                                r6.b(nVar4);
                                            }
                                        }
                                        nVar4 = nVar4.f5863m;
                                        r6 = r6;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                nVar3 = AbstractC1248f.f(r6);
                            }
                        }
                        nVar2 = nVar2.f5862l;
                    }
                }
                v3 = v3.s();
                nVar2 = (v3 == null || (c0292u = v3.f10378C) == null) ? c0442s : (n0) c0292u.f4243e;
            }
        }
        c0442s2 = c0442s;
        if (c0442s2 != null && !h.a(c0442s2, c0442s3)) {
            z3 = ((Boolean) dVar2.l(c0442s2)).booleanValue();
        }
        return Boolean.valueOf(z3);
    }

    public final boolean d(int i2) {
        Boolean c3;
        s sVar = new s();
        sVar.f11909h = Boolean.FALSE;
        Boolean c4 = c(i2, (b0.d) this.f6744d.c(), new U2(i2, 2, sVar));
        if (c4 == null || sVar.f11909h == null) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        if (h.a(c4, bool) && h.a(sVar.f11909h, bool)) {
            return true;
        }
        return (C0425b.a(i2, 1) || C0425b.a(i2, 2)) ? a(i2, false, false) && (c3 = c(i2, null, new C0136k1(i2, 3))) != null && c3.booleanValue() : ((Boolean) this.f6742b.l(new C0425b(i2))).booleanValue();
    }
}
