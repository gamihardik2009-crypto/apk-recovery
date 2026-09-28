package a0;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import b.C0499w;
import j.C0736B;
import m2.C0880v;
import n2.AbstractC0946A;
import s.AbstractC1166e;
import t0.AbstractC1248f;
import t0.AbstractC1256n;
import u0.C1314v;
import u0.N;

/* renamed from: a0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0428e extends z2.f implements y2.a {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f6455p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0428e(int i2, Object obj, Class cls, String str, String str2, int i3, int i4) {
        super(i2, i3, cls, obj, str, str2);
        this.f6455p = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y2.a
    public final Object c() {
        EnumC0441r enumC0441r;
        C0880v c0880v;
        C0736B c0736b;
        C0736B c0736b2;
        C0429f c0429f;
        C0736B c0736b3;
        int i2;
        Object[] objArr;
        long[] jArr;
        EnumC0441r enumC0441r2;
        int i3;
        C0736B c0736b4;
        Object[] objArr2;
        long[] jArr2;
        C0429f c0429f2;
        C0736B c0736b5;
        EnumC0441r enumC0441r3;
        L.d dVar;
        L.d dVar2;
        C0736B c0736b6;
        C0736B c0736b7;
        C0429f c0429f3;
        C0736B c0736b8;
        int i4;
        L.d dVar3;
        Object[] objArr3;
        long[] jArr3;
        int i5;
        EnumC0441r enumC0441r4;
        C0880v c0880v2;
        Object[] objArr4;
        long[] jArr4;
        L.d dVar4;
        L.d dVar5;
        long[] jArr5;
        EnumC0441r enumC0441r5;
        C0880v c0880v3;
        EnumC0441r enumC0441r6;
        int i6;
        L.d dVar6;
        ContentCaptureSession a3;
        EnumC0441r enumC0441r7 = EnumC0441r.f6490j;
        C0880v c0880v4 = C0880v.f8657a;
        Object obj = this.f11890i;
        switch (this.f6455p) {
            case 0:
                C0429f c0429f4 = (C0429f) obj;
                C0736B c0736b9 = c0429f4.f6460e;
                Object[] objArr5 = c0736b9.f7965b;
                long[] jArr6 = c0736b9.f7964a;
                int length = jArr6.length - 2;
                char c3 = 7;
                C0736B c0736b10 = c0429f4.f6458c;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j3 = jArr6[i7];
                        c0736b = c0736b9;
                        if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                            int i9 = 0;
                            while (i9 < i8) {
                                if ((j3 & 255) < 128) {
                                    V.n nVar = (V.n) ((InterfaceC0436m) objArr5[(i7 << 3) + i9]);
                                    V.n nVar2 = nVar.f5858h;
                                    objArr4 = objArr5;
                                    if (nVar2.f5869t) {
                                        L.d dVar7 = null;
                                        while (nVar2 != null) {
                                            L.d dVar8 = dVar7;
                                            if (nVar2 instanceof C0442s) {
                                                c0736b10.a((C0442s) nVar2);
                                            } else if ((nVar2.f5860j & 1024) != 0 && (nVar2 instanceof AbstractC1256n)) {
                                                V.n nVar3 = ((AbstractC1256n) nVar2).f10608v;
                                                jArr5 = jArr6;
                                                int i10 = 0;
                                                while (nVar3 != null) {
                                                    C0880v c0880v5 = c0880v4;
                                                    if ((nVar3.f5860j & 1024) != 0) {
                                                        i10++;
                                                        if (i10 == 1) {
                                                            enumC0441r6 = enumC0441r7;
                                                            nVar2 = nVar3;
                                                        } else {
                                                            if (dVar8 == null) {
                                                                enumC0441r6 = enumC0441r7;
                                                                i6 = i10;
                                                                dVar6 = new L.d(new V.n[16]);
                                                            } else {
                                                                enumC0441r6 = enumC0441r7;
                                                                i6 = i10;
                                                                dVar6 = dVar8;
                                                            }
                                                            if (nVar2 != null) {
                                                                dVar6.b(nVar2);
                                                                nVar2 = null;
                                                            }
                                                            dVar6.b(nVar3);
                                                            dVar8 = dVar6;
                                                            i10 = i6;
                                                        }
                                                    } else {
                                                        enumC0441r6 = enumC0441r7;
                                                    }
                                                    nVar3 = nVar3.f5863m;
                                                    c0880v4 = c0880v5;
                                                    enumC0441r7 = enumC0441r6;
                                                }
                                                enumC0441r5 = enumC0441r7;
                                                c0880v3 = c0880v4;
                                                if (i10 == 1) {
                                                    dVar7 = dVar8;
                                                    jArr6 = jArr5;
                                                    c0880v4 = c0880v3;
                                                    enumC0441r7 = enumC0441r5;
                                                }
                                                dVar7 = dVar8;
                                                nVar2 = AbstractC1248f.f(dVar7);
                                                jArr6 = jArr5;
                                                c0880v4 = c0880v3;
                                                enumC0441r7 = enumC0441r5;
                                            }
                                            enumC0441r5 = enumC0441r7;
                                            c0880v3 = c0880v4;
                                            jArr5 = jArr6;
                                            dVar7 = dVar8;
                                            nVar2 = AbstractC1248f.f(dVar7);
                                            jArr6 = jArr5;
                                            c0880v4 = c0880v3;
                                            enumC0441r7 = enumC0441r5;
                                        }
                                        enumC0441r4 = enumC0441r7;
                                        c0880v2 = c0880v4;
                                        jArr4 = jArr6;
                                        V.n nVar4 = nVar.f5858h;
                                        if (!nVar4.f5869t) {
                                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                                        }
                                        L.d dVar9 = new L.d(new V.n[16]);
                                        V.n nVar5 = nVar4.f5863m;
                                        if (nVar5 == null) {
                                            AbstractC1248f.b(dVar9, nVar4);
                                        } else {
                                            dVar9.b(nVar5);
                                        }
                                        while (dVar9.l()) {
                                            V.n nVar6 = (V.n) dVar9.n(dVar9.f4620j - 1);
                                            if ((nVar6.f5861k & 1024) == 0) {
                                                AbstractC1248f.b(dVar9, nVar6);
                                            } else {
                                                while (true) {
                                                    if (nVar6 == null) {
                                                        break;
                                                    }
                                                    if ((nVar6.f5860j & 1024) != 0) {
                                                        L.d dVar10 = null;
                                                        while (nVar6 != null) {
                                                            if (nVar6 instanceof C0442s) {
                                                                c0736b10.a((C0442s) nVar6);
                                                            } else if ((nVar6.f5860j & 1024) != 0 && (nVar6 instanceof AbstractC1256n)) {
                                                                V.n nVar7 = ((AbstractC1256n) nVar6).f10608v;
                                                                int i11 = 0;
                                                                while (nVar7 != null) {
                                                                    if ((nVar7.f5860j & 1024) != 0) {
                                                                        i11++;
                                                                        if (i11 == 1) {
                                                                            dVar5 = dVar9;
                                                                            nVar6 = nVar7;
                                                                        } else {
                                                                            if (dVar10 == null) {
                                                                                dVar5 = dVar9;
                                                                                dVar10 = new L.d(new V.n[16]);
                                                                            } else {
                                                                                dVar5 = dVar9;
                                                                            }
                                                                            if (nVar6 != null) {
                                                                                dVar10.b(nVar6);
                                                                                nVar6 = null;
                                                                            }
                                                                            dVar10.b(nVar7);
                                                                        }
                                                                    } else {
                                                                        dVar5 = dVar9;
                                                                    }
                                                                    nVar7 = nVar7.f5863m;
                                                                    dVar9 = dVar5;
                                                                }
                                                                dVar4 = dVar9;
                                                                if (i11 == 1) {
                                                                    dVar9 = dVar4;
                                                                }
                                                                nVar6 = AbstractC1248f.f(dVar10);
                                                                dVar9 = dVar4;
                                                            }
                                                            dVar4 = dVar9;
                                                            nVar6 = AbstractC1248f.f(dVar10);
                                                            dVar9 = dVar4;
                                                        }
                                                    } else {
                                                        nVar6 = nVar6.f5863m;
                                                        dVar9 = dVar9;
                                                    }
                                                }
                                            }
                                        }
                                        j3 >>= 8;
                                        i9++;
                                        objArr5 = objArr4;
                                        jArr6 = jArr4;
                                        c0880v4 = c0880v2;
                                        enumC0441r7 = enumC0441r4;
                                    } else {
                                        enumC0441r4 = enumC0441r7;
                                        c0880v2 = c0880v4;
                                    }
                                } else {
                                    enumC0441r4 = enumC0441r7;
                                    c0880v2 = c0880v4;
                                    objArr4 = objArr5;
                                }
                                jArr4 = jArr6;
                                j3 >>= 8;
                                i9++;
                                objArr5 = objArr4;
                                jArr6 = jArr4;
                                c0880v4 = c0880v2;
                                enumC0441r7 = enumC0441r4;
                            }
                            enumC0441r = enumC0441r7;
                            c0880v = c0880v4;
                            objArr3 = objArr5;
                            jArr3 = jArr6;
                            i5 = 1;
                            if (i8 != 8) {
                            }
                        } else {
                            enumC0441r = enumC0441r7;
                            c0880v = c0880v4;
                            objArr3 = objArr5;
                            jArr3 = jArr6;
                            i5 = 1;
                        }
                        if (i7 != length) {
                            i7 += i5;
                            c0736b9 = c0736b;
                            objArr5 = objArr3;
                            jArr6 = jArr3;
                            c0880v4 = c0880v;
                            enumC0441r7 = enumC0441r;
                            c3 = 7;
                        }
                    }
                } else {
                    enumC0441r = enumC0441r7;
                    c0880v = c0880v4;
                    c0736b = c0736b9;
                }
                c0736b.b();
                C0736B c0736b11 = c0429f4.f6459d;
                Object[] objArr6 = c0736b11.f7965b;
                long[] jArr7 = c0736b11.f7964a;
                int length2 = jArr7.length - 2;
                C0736B c0736b12 = c0429f4.f6461f;
                if (length2 >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j4 = jArr7[i12];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j4 & 255) < 128) {
                                    InterfaceC0426c interfaceC0426c = (InterfaceC0426c) objArr6[(i12 << 3) + i14];
                                    V.n nVar8 = (V.n) interfaceC0426c;
                                    objArr2 = objArr6;
                                    V.n nVar9 = nVar8.f5858h;
                                    jArr2 = jArr7;
                                    if (nVar9.f5869t) {
                                        EnumC0441r enumC0441r8 = enumC0441r;
                                        boolean z3 = false;
                                        boolean z4 = true;
                                        C0442s c0442s = null;
                                        L.d dVar11 = null;
                                        while (nVar9 != null) {
                                            EnumC0441r enumC0441r9 = enumC0441r8;
                                            if (nVar9 instanceof C0442s) {
                                                C0442s c0442s2 = (C0442s) nVar9;
                                                if (c0442s != null) {
                                                    z3 = true;
                                                }
                                                if (c0736b10.c(c0442s2)) {
                                                    c0736b12.a(c0442s2);
                                                    z4 = false;
                                                }
                                                c0736b6 = c0736b11;
                                                c0442s = c0442s2;
                                            } else if ((nVar9.f5860j & 1024) == 0 || !(nVar9 instanceof AbstractC1256n)) {
                                                c0736b6 = c0736b11;
                                            } else {
                                                V.n nVar10 = ((AbstractC1256n) nVar9).f10608v;
                                                c0736b7 = c0736b;
                                                int i15 = 0;
                                                while (nVar10 != null) {
                                                    C0429f c0429f5 = c0429f4;
                                                    if ((nVar10.f5860j & 1024) != 0) {
                                                        i15++;
                                                        if (i15 == 1) {
                                                            c0736b8 = c0736b11;
                                                            nVar9 = nVar10;
                                                        } else {
                                                            if (dVar11 == null) {
                                                                c0736b8 = c0736b11;
                                                                i4 = i15;
                                                                dVar3 = new L.d(new V.n[16]);
                                                            } else {
                                                                c0736b8 = c0736b11;
                                                                i4 = i15;
                                                                dVar3 = dVar11;
                                                            }
                                                            if (nVar9 != null) {
                                                                dVar3.b(nVar9);
                                                                nVar9 = null;
                                                            }
                                                            dVar3.b(nVar10);
                                                            dVar11 = dVar3;
                                                            i15 = i4;
                                                        }
                                                    } else {
                                                        c0736b8 = c0736b11;
                                                    }
                                                    nVar10 = nVar10.f5863m;
                                                    c0429f4 = c0429f5;
                                                    c0736b11 = c0736b8;
                                                }
                                                c0736b6 = c0736b11;
                                                c0429f3 = c0429f4;
                                                if (i15 == 1) {
                                                    enumC0441r8 = enumC0441r9;
                                                    c0736b = c0736b7;
                                                    c0429f4 = c0429f3;
                                                    c0736b11 = c0736b6;
                                                }
                                                nVar9 = AbstractC1248f.f(dVar11);
                                                enumC0441r8 = enumC0441r9;
                                                c0736b = c0736b7;
                                                c0429f4 = c0429f3;
                                                c0736b11 = c0736b6;
                                            }
                                            c0429f3 = c0429f4;
                                            c0736b7 = c0736b;
                                            nVar9 = AbstractC1248f.f(dVar11);
                                            enumC0441r8 = enumC0441r9;
                                            c0736b = c0736b7;
                                            c0429f4 = c0429f3;
                                            c0736b11 = c0736b6;
                                        }
                                        c0736b4 = c0736b11;
                                        enumC0441r3 = enumC0441r8;
                                        c0429f2 = c0429f4;
                                        c0736b5 = c0736b;
                                        V.n nVar11 = nVar8.f5858h;
                                        if (!nVar11.f5869t) {
                                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                                        }
                                        L.d dVar12 = new L.d(new V.n[16]);
                                        V.n nVar12 = nVar11.f5863m;
                                        if (nVar12 == null) {
                                            AbstractC1248f.b(dVar12, nVar11);
                                        } else {
                                            dVar12.b(nVar12);
                                        }
                                        while (dVar12.l()) {
                                            V.n nVar13 = (V.n) dVar12.n(dVar12.f4620j - 1);
                                            if ((nVar13.f5861k & 1024) == 0) {
                                                AbstractC1248f.b(dVar12, nVar13);
                                            } else {
                                                while (nVar13 != null) {
                                                    if ((nVar13.f5860j & 1024) != 0) {
                                                        L.d dVar13 = null;
                                                        while (nVar13 != null) {
                                                            if (nVar13 instanceof C0442s) {
                                                                C0442s c0442s3 = (C0442s) nVar13;
                                                                if (c0442s != null) {
                                                                    z3 = true;
                                                                }
                                                                if (c0736b10.c(c0442s3)) {
                                                                    c0736b12.a(c0442s3);
                                                                    z4 = false;
                                                                }
                                                                c0442s = c0442s3;
                                                            } else if ((nVar13.f5860j & 1024) != 0 && (nVar13 instanceof AbstractC1256n)) {
                                                                V.n nVar14 = ((AbstractC1256n) nVar13).f10608v;
                                                                int i16 = 0;
                                                                while (nVar14 != null) {
                                                                    if ((nVar14.f5860j & 1024) != 0) {
                                                                        i16++;
                                                                        if (i16 == 1) {
                                                                            dVar2 = dVar12;
                                                                            nVar13 = nVar14;
                                                                        } else {
                                                                            if (dVar13 == null) {
                                                                                dVar2 = dVar12;
                                                                                dVar13 = new L.d(new V.n[16]);
                                                                            } else {
                                                                                dVar2 = dVar12;
                                                                            }
                                                                            if (nVar13 != null) {
                                                                                dVar13.b(nVar13);
                                                                                nVar13 = null;
                                                                            }
                                                                            dVar13.b(nVar14);
                                                                            nVar14 = nVar14.f5863m;
                                                                            dVar12 = dVar2;
                                                                        }
                                                                    } else {
                                                                        dVar2 = dVar12;
                                                                    }
                                                                    nVar14 = nVar14.f5863m;
                                                                    dVar12 = dVar2;
                                                                }
                                                                dVar = dVar12;
                                                                if (i16 == 1) {
                                                                    dVar12 = dVar;
                                                                }
                                                                nVar13 = AbstractC1248f.f(dVar13);
                                                                dVar12 = dVar;
                                                            }
                                                            dVar = dVar12;
                                                            nVar13 = AbstractC1248f.f(dVar13);
                                                            dVar12 = dVar;
                                                        }
                                                    } else {
                                                        nVar13 = nVar13.f5863m;
                                                        dVar12 = dVar12;
                                                    }
                                                }
                                            }
                                            dVar12 = dVar12;
                                        }
                                        if (z4) {
                                            interfaceC0426c.D(z3 ? AbstractC0427d.o(interfaceC0426c) : c0442s != null ? c0442s.L0() : enumC0441r3);
                                        }
                                        j4 >>= 8;
                                        i14++;
                                        objArr6 = objArr2;
                                        jArr7 = jArr2;
                                        enumC0441r = enumC0441r3;
                                        c0736b = c0736b5;
                                        c0429f4 = c0429f2;
                                        c0736b11 = c0736b4;
                                    } else {
                                        EnumC0441r enumC0441r10 = enumC0441r;
                                        interfaceC0426c.D(enumC0441r10);
                                        c0736b4 = c0736b11;
                                        enumC0441r3 = enumC0441r10;
                                        c0429f2 = c0429f4;
                                        c0736b5 = c0736b;
                                    }
                                } else {
                                    c0736b4 = c0736b11;
                                    objArr2 = objArr6;
                                    jArr2 = jArr7;
                                    c0429f2 = c0429f4;
                                    c0736b5 = c0736b;
                                    enumC0441r3 = enumC0441r;
                                }
                                j4 >>= 8;
                                i14++;
                                objArr6 = objArr2;
                                jArr7 = jArr2;
                                enumC0441r = enumC0441r3;
                                c0736b = c0736b5;
                                c0429f4 = c0429f2;
                                c0736b11 = c0736b4;
                            }
                            c0736b2 = c0736b11;
                            objArr = objArr6;
                            jArr = jArr7;
                            c0429f = c0429f4;
                            c0736b3 = c0736b;
                            enumC0441r2 = enumC0441r;
                            i3 = 1;
                            if (i13 != 8) {
                            }
                        } else {
                            c0736b2 = c0736b11;
                            objArr = objArr6;
                            jArr = jArr7;
                            c0429f = c0429f4;
                            c0736b3 = c0736b;
                            enumC0441r2 = enumC0441r;
                            i3 = 1;
                        }
                        if (i12 != length2) {
                            i12 += i3;
                            objArr6 = objArr;
                            jArr7 = jArr;
                            enumC0441r = enumC0441r2;
                            c0736b = c0736b3;
                            c0429f4 = c0429f;
                            c0736b11 = c0736b2;
                        }
                    }
                } else {
                    c0736b2 = c0736b11;
                    c0429f = c0429f4;
                    c0736b3 = c0736b;
                }
                c0736b2.b();
                Object[] objArr7 = c0736b10.f7965b;
                long[] jArr8 = c0736b10.f7964a;
                int length3 = jArr8.length - 2;
                if (length3 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j5 = jArr8[i17];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i18 = 8 - ((~(i17 - length3)) >>> 31);
                            for (int i19 = 0; i19 < i18; i19++) {
                                if ((j5 & 255) < 128) {
                                    C0442s c0442s4 = (C0442s) objArr7[(i17 << 3) + i19];
                                    if (c0442s4.f5869t) {
                                        EnumC0441r L02 = c0442s4.L0();
                                        c0442s4.O0();
                                        if (L02 != c0442s4.L0() || c0736b12.c(c0442s4)) {
                                            AbstractC0427d.A(c0442s4);
                                        }
                                    }
                                }
                                j5 >>= 8;
                            }
                            i2 = 1;
                            if (i18 != 8) {
                            }
                        } else {
                            i2 = 1;
                        }
                        if (i17 != length3) {
                            i17 += i2;
                        }
                    }
                }
                c0736b10.b();
                c0736b12.b();
                c0429f.f6457b.c();
                if (!c0736b3.g()) {
                    AbstractC0946A.r("Unprocessed FocusProperties nodes");
                    throw null;
                }
                if (!c0736b2.g()) {
                    AbstractC0946A.r("Unprocessed FocusEvent nodes");
                    throw null;
                }
                if (c0736b10.g()) {
                    return c0880v;
                }
                AbstractC0946A.r("Unprocessed FocusTarget nodes");
                throw null;
            case 1:
                androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) obj;
                if (bVar.f6746f.L0() == enumC0441r7) {
                    bVar.f6743c.c();
                }
                return c0880v4;
            case 2:
                ((C0499w) obj).e();
                return c0880v4;
            case 3:
                ((C0499w) obj).e();
                return c0880v4;
            case 4:
                View view = (View) obj;
                int i20 = N.f10928e;
                int i21 = Build.VERSION.SDK_INT;
                if (i21 >= 30) {
                    x0.g.a(view, 1);
                }
                if (i21 < 29 || (a3 = x0.f.a(view)) == null) {
                    return null;
                }
                return new x0.d(a3, view);
            case AbstractC1166e.f10138f /* 5 */:
                C1314v c1314v = (C1314v) obj;
                if (c1314v.isFocused() || c1314v.hasFocus()) {
                    c1314v.clearFocus();
                }
                return c0880v4;
            default:
                return ((C1314v) obj).x();
        }
    }
}
