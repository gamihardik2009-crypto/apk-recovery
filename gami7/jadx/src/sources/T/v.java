package T;

import J.C0257c;
import J.C0281o;
import j.C0736B;
import j.C0766v;
import j.C0769y;
import java.util.HashMap;
import t0.g0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final y2.c f5734a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5735b;

    /* renamed from: c, reason: collision with root package name */
    public C0766v f5736c;

    /* renamed from: j, reason: collision with root package name */
    public int f5743j;

    /* renamed from: d, reason: collision with root package name */
    public int f5737d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final B.F f5738e = new B.F(10);

    /* renamed from: f, reason: collision with root package name */
    public final C0769y f5739f = new C0769y();

    /* renamed from: g, reason: collision with root package name */
    public final C0736B f5740g = new C0736B();

    /* renamed from: h, reason: collision with root package name */
    public final L.d f5741h = new L.d(new J.F[16]);

    /* renamed from: i, reason: collision with root package name */
    public final C0281o f5742i = new C0281o(1, this);

    /* renamed from: k, reason: collision with root package name */
    public final B.F f5744k = new B.F(10);

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f5745l = new HashMap();

    public v(y2.c cVar) {
        this.f5734a = cVar;
    }

    public final void a(Object obj, A0.n nVar, y2.a aVar) {
        long[] jArr;
        long[] jArr2;
        int i2;
        Object obj2 = this.f5735b;
        C0766v c0766v = this.f5736c;
        int i3 = this.f5737d;
        this.f5735b = obj;
        this.f5736c = (C0766v) this.f5739f.e(obj);
        if (this.f5737d == -1) {
            this.f5737d = n.k().d();
        }
        C0281o c0281o = this.f5742i;
        L.d E = C0257c.E();
        try {
            E.b(c0281o);
            s.e(nVar, aVar);
            E.n(E.f4620j - 1);
            Object obj3 = this.f5735b;
            z2.h.c(obj3);
            int i4 = this.f5737d;
            C0766v c0766v2 = this.f5736c;
            if (c0766v2 != null) {
                long[] jArr3 = c0766v2.f8051a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j3 = jArr3[i5];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8;
                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j3 & 255) < 128) {
                                    int i9 = (i5 << 3) + i8;
                                    Object obj4 = c0766v2.f8052b[i9];
                                    jArr2 = jArr3;
                                    boolean z3 = c0766v2.f8053c[i9] != i4;
                                    if (z3) {
                                        d(obj3, obj4);
                                    }
                                    if (z3) {
                                        c0766v2.g(i9);
                                    }
                                    i2 = 8;
                                } else {
                                    jArr2 = jArr3;
                                    i2 = i6;
                                }
                                j3 >>= i2;
                                i8++;
                                i6 = i2;
                                jArr3 = jArr2;
                            }
                            jArr = jArr3;
                            if (i7 != i6) {
                                break;
                            }
                        } else {
                            jArr = jArr3;
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                        jArr3 = jArr;
                    }
                }
            }
            this.f5735b = obj2;
            this.f5736c = c0766v;
            this.f5737d = i3;
        } catch (Throwable th) {
            E.n(E.f4620j - 1);
            throw th;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean b(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.v.b(java.util.Set):boolean");
    }

    public final void c(Object obj, int i2, Object obj2, C0766v c0766v) {
        int i3;
        if (this.f5743j > 0) {
            return;
        }
        int c3 = c0766v.c(obj);
        if (c3 < 0) {
            c3 = ~c3;
            i3 = -1;
        } else {
            i3 = c0766v.f8053c[c3];
        }
        c0766v.f8052b[c3] = obj;
        c0766v.f8053c[c3] = i2;
        if ((obj instanceof J.F) && i3 != i2) {
            J.D h2 = ((J.F) obj).h();
            this.f5745l.put(obj, h2.f3977f);
            C0766v c0766v2 = h2.f3976e;
            B.F f3 = this.f5744k;
            f3.E(obj);
            Object[] objArr = c0766v2.f8052b;
            long[] jArr = c0766v2.f8051a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j3 = jArr[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i6 = 0; i6 < i5; i6++) {
                            if ((j3 & 255) < 128) {
                                A a3 = (A) objArr[(i4 << 3) + i6];
                                if (a3 instanceof B) {
                                    ((B) a3).f(2);
                                }
                                f3.r(a3, obj);
                            }
                            j3 >>= 8;
                        }
                        if (i5 != 8) {
                            break;
                        }
                    }
                    if (i4 == length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        if (i3 == -1) {
            if (obj instanceof B) {
                ((B) obj).f(2);
            }
            this.f5738e.r(obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        B.F f3 = this.f5738e;
        f3.D(obj2, obj);
        if (!(obj2 instanceof J.F) || ((C0769y) f3.f165i).b(obj2)) {
            return;
        }
        this.f5744k.E(obj2);
        this.f5745l.remove(obj2);
    }

    public final void e() {
        long[] jArr;
        int i2;
        long[] jArr2;
        int i3;
        long j3;
        int i4;
        char c3;
        long j4;
        int i5;
        long[] jArr3;
        long[] jArr4;
        C0769y c0769y = this.f5739f;
        long[] jArr5 = c0769y.f8065a;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j5 = jArr5[i6];
            char c4 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8;
                int i8 = 8 - ((~(i6 - length)) >>> 31);
                int i9 = 0;
                while (i9 < i8) {
                    if ((j5 & 255) < 128) {
                        int i10 = (i6 << 3) + i9;
                        Object obj = c0769y.f8066b[i10];
                        C0766v c0766v = (C0766v) c0769y.f8067c[i10];
                        z2.h.d(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                        Boolean valueOf = Boolean.valueOf(!((g0) obj).R());
                        if (valueOf.booleanValue()) {
                            Object[] objArr = c0766v.f8052b;
                            int[] iArr = c0766v.f8053c;
                            long[] jArr6 = c0766v.f8051a;
                            int length2 = jArr6.length - 2;
                            jArr2 = jArr5;
                            i3 = i6;
                            j3 = j5;
                            if (length2 >= 0) {
                                int i11 = 0;
                                while (true) {
                                    long j7 = jArr6[i11];
                                    i4 = i8;
                                    c3 = 7;
                                    j4 = -9187201950435737472L;
                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                        int i13 = 0;
                                        while (i13 < i12) {
                                            if ((j7 & 255) < 128) {
                                                int i14 = (i11 << 3) + i13;
                                                jArr4 = jArr6;
                                                Object obj2 = objArr[i14];
                                                int i15 = iArr[i14];
                                                d(obj, obj2);
                                            } else {
                                                jArr4 = jArr6;
                                            }
                                            j7 >>= 8;
                                            i13++;
                                            jArr6 = jArr4;
                                        }
                                        jArr3 = jArr6;
                                        if (i12 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr6;
                                    }
                                    if (i11 == length2) {
                                        break;
                                    }
                                    i11++;
                                    i8 = i4;
                                    jArr6 = jArr3;
                                }
                            } else {
                                i4 = i8;
                                j4 = -9187201950435737472L;
                                c3 = 7;
                            }
                        } else {
                            jArr2 = jArr5;
                            i3 = i6;
                            j3 = j5;
                            i4 = i8;
                            c3 = c4;
                            j4 = j6;
                        }
                        if (valueOf.booleanValue()) {
                            c0769y.h(i10);
                        }
                        i5 = 8;
                    } else {
                        jArr2 = jArr5;
                        i3 = i6;
                        j3 = j5;
                        i4 = i8;
                        c3 = c4;
                        j4 = j6;
                        i5 = i7;
                    }
                    j5 = j3 >> i5;
                    i9++;
                    i7 = i5;
                    j6 = j4;
                    c4 = c3;
                    jArr5 = jArr2;
                    i6 = i3;
                    i8 = i4;
                }
                jArr = jArr5;
                int i16 = i6;
                if (i8 != i7) {
                    return;
                } else {
                    i2 = i16;
                }
            } else {
                jArr = jArr5;
                i2 = i6;
            }
            if (i2 == length) {
                return;
            }
            i6 = i2 + 1;
            jArr5 = jArr;
        }
    }
}
