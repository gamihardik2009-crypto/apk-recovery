package n1;

import J.X0;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.U;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import m.C0850x;
import m2.C0880v;
import n2.AbstractC0949a;
import n2.C0971w;
import o.C0985k;
import o.C0988n;
import p.C1045u0;
import p.X;
import r0.C1090D;
import r0.C1111Z;
import r0.C1133v;
import s.AbstractC1166e;
import s0.C1190d;
import s0.C1194h;
import t0.AbstractC1248f;
import t0.C1236E;
import t0.C1237F;
import t0.C1241J;
import t0.C1242K;
import t0.C1245c;
import t0.L;
import t0.Z;
import u0.AbstractC1296l0;
import u0.V;
import v.C1346S;
import w1.C1381c;
import w1.C1384f;
import w1.C1385g;
import x.C1390c;
import z.S;
import z.n0;

/* renamed from: n1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0944e extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9025i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f9026j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0944e(int i2, Object obj) {
        super(0);
        this.f9025i = i2;
        this.f9026j = obj;
    }

    @Override // y2.a
    public final Object c() {
        C1384f c1384f;
        switch (this.f9025i) {
            case 0:
                C0945f c0945f = (C0945f) this.f9026j;
                Context context = c0945f.f9027h;
                Context applicationContext = context != null ? context.getApplicationContext() : null;
                return new U(applicationContext instanceof Application ? (Application) applicationContext : null, c0945f, c0945f.g());
            case 1:
                return z2.h.h((Object[]) this.f9026j);
            case 2:
                return AbstractC0949a.f((Context) this.f9026j);
            case 3:
                X0 x02 = AbstractC1296l0.f11087f;
                C1045u0 c1045u0 = (C1045u0) this.f9026j;
                c1045u0.f9689I.f9647a = new C0850x(new B.F((O0.b) AbstractC1248f.i(c1045u0, x02)));
                return C0880v.f8657a;
            case 4:
                C1090D a3 = ((C1111Z) this.f9026j).a();
                C1236E c1236e = a3.f9808h;
                if (a3.f9820u != c1236e.p().size()) {
                    Iterator it = a3.f9813m.entrySet().iterator();
                    while (it.hasNext()) {
                        ((C1133v) ((Map.Entry) it.next()).getValue()).f9892d = true;
                    }
                    if (!c1236e.f10379D.f10467d) {
                        C1236E.U(c1236e, false, 7);
                    }
                }
                return C0880v.f8657a;
            case AbstractC1166e.f10138f /* 5 */:
                r1.x xVar = (r1.x) this.f9026j;
                String b3 = xVar.b();
                r1.r rVar = xVar.f10020a;
                rVar.getClass();
                rVar.a();
                rVar.b();
                return rVar.g().q().c(b3);
            case AbstractC1166e.f10136d /* 6 */:
                C1190d c1190d = (C1190d) this.f9026j;
                int i2 = 0;
                c1190d.f10199f = false;
                HashSet hashSet = new HashSet();
                L.d dVar = c1190d.f10197d;
                int i3 = dVar.f4620j;
                L.d dVar2 = c1190d.f10198e;
                if (i3 > 0) {
                    Object[] objArr = dVar.f4618h;
                    int i4 = 0;
                    do {
                        C1236E c1236e2 = (C1236E) objArr[i4];
                        C1194h c1194h = (C1194h) dVar2.f4618h[i4];
                        V.n nVar = (V.n) c1236e2.f10378C.f4244f;
                        if (nVar.f5869t) {
                            C1190d.b(nVar, c1194h, hashSet);
                        }
                        i4++;
                    } while (i4 < i3);
                }
                dVar.g();
                dVar2.g();
                L.d dVar3 = c1190d.f10195b;
                int i5 = dVar3.f4620j;
                L.d dVar4 = c1190d.f10196c;
                if (i5 > 0) {
                    Object[] objArr2 = dVar3.f4618h;
                    do {
                        C1245c c1245c = (C1245c) objArr2[i2];
                        C1194h c1194h2 = (C1194h) dVar4.f4618h[i2];
                        if (c1245c.f5869t) {
                            C1190d.b(c1245c, c1194h2, hashSet);
                        }
                        i2++;
                    } while (i2 < i5);
                }
                dVar3.g();
                dVar4.g();
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C1245c) it2.next()).M0();
                }
                return C0880v.f8657a;
            case 7:
                L l3 = ((C1236E) this.f9026j).f10379D;
                l3.f10480r.f10441D = true;
                C1241J c1241j = l3.f10481s;
                if (c1241j != null) {
                    c1241j.f10421A = true;
                }
                return C0880v.f8657a;
            case 8:
                C1242K c1242k = (C1242K) this.f9026j;
                L l4 = c1242k.f10450O;
                int i6 = 0;
                l4.f10474k = 0;
                L.d v3 = l4.f10464a.v();
                int i7 = v3.f4620j;
                if (i7 > 0) {
                    Object[] objArr3 = v3.f4618h;
                    int i8 = 0;
                    do {
                        C1242K c1242k2 = ((C1236E) objArr3[i8]).f10379D.f10480r;
                        c1242k2.f10452n = c1242k2.f10453o;
                        c1242k2.f10453o = Integer.MAX_VALUE;
                        c1242k2.f10438A = false;
                        if (c1242k2.f10455r == 2) {
                            c1242k2.f10455r = 3;
                        }
                        i8++;
                    } while (i8 < i7);
                }
                L l5 = c1242k.f10450O;
                L.d v4 = l5.f10464a.v();
                int i9 = v4.f4620j;
                if (i9 > 0) {
                    Object[] objArr4 = v4.f4618h;
                    int i10 = 0;
                    do {
                        ((C1236E) objArr4[i10]).f10379D.f10480r.f10439B.f10408d = false;
                        i10++;
                    } while (i10 < i9);
                }
                c1242k.T().C0().j();
                C1236E c1236e3 = l5.f10464a;
                L.d v5 = c1236e3.v();
                int i11 = v5.f4620j;
                if (i11 > 0) {
                    Object[] objArr5 = v5.f4618h;
                    int i12 = 0;
                    do {
                        C1236E c1236e4 = (C1236E) objArr5[i12];
                        if (c1236e4.f10379D.f10480r.f10452n != c1236e4.t()) {
                            c1236e3.K();
                            c1236e3.y();
                            if (c1236e4.t() == Integer.MAX_VALUE) {
                                c1236e4.f10379D.f10480r.y0();
                            }
                        }
                        i12++;
                    } while (i12 < i11);
                }
                L.d v6 = c1236e3.v();
                int i13 = v6.f4620j;
                if (i13 > 0) {
                    Object[] objArr6 = v6.f4618h;
                    do {
                        C1237F c1237f = ((C1236E) objArr6[i6]).f10379D.f10480r.f10439B;
                        c1237f.f10409e = c1237f.f10408d;
                        i6++;
                    } while (i6 < i13);
                }
                return C0880v.f8657a;
            case AbstractC1166e.f10135c /* 9 */:
                L l6 = (L) this.f9026j;
                l6.a().a(l6.f10482t);
                return C0880v.f8657a;
            case AbstractC1166e.f10137e /* 10 */:
                Z z3 = ((Z) this.f9026j).f10549v;
                if (z3 != null) {
                    z3.Z0();
                }
                return C0880v.f8657a;
            case 11:
                J2.B.c(((u0.U) this.f9026j).f10979j, null);
                return C0880v.f8657a;
            case 12:
                ((V) this.f9026j).f10982b = null;
                return C0880v.f8657a;
            case 13:
                return new C1346S((S.j) this.f9026j, C0971w.f9166h);
            case 14:
                C1385g c1385g = (C1385g) this.f9026j;
                if (c1385g.f11458i == null || !c1385g.f11460k) {
                    c1384f = new C1384f(c1385g.f11457h, c1385g.f11458i, new C1381c(), c1385g.f11459j, c1385g.f11461l);
                } else {
                    Context context2 = c1385g.f11457h;
                    z2.h.f(context2, "context");
                    File noBackupFilesDir = context2.getNoBackupFilesDir();
                    z2.h.e(noBackupFilesDir, "context.noBackupFilesDir");
                    c1384f = new C1384f(c1385g.f11457h, new File(noBackupFilesDir, c1385g.f11458i).getAbsolutePath(), new C1381c(), c1385g.f11459j, c1385g.f11461l);
                }
                c1384f.setWriteAheadLoggingEnabled(c1385g.f11463n);
                return c1384f;
            case AbstractC1166e.f10139g /* 15 */:
                ((C1390c) this.f9026j).f11469P.l(Boolean.valueOf(!r1.f11468O));
                return C0880v.f8657a;
            case 16:
                ((C0988n) this.f9026j).f9216a.setValue(C0985k.f9214a);
                return C0880v.f8657a;
            case 17:
                return ((S) this.f9026j).d();
            default:
                return new n0((X) this.f9026j, 0.0f);
        }
    }
}
