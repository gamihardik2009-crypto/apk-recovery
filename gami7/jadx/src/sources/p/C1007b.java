package p;

import H.O3;
import J.C0278m0;
import J.InterfaceC0258c0;
import a.AbstractC0423a;
import a0.InterfaceC0431h;
import android.content.Context;
import android.os.CancellationSignal;
import android.view.Choreographer;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import androidx.lifecycle.C0472v;
import androidx.lifecycle.EnumC0466o;
import b1.AbstractC0535l;
import b1.AbstractC0542s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import m2.C0865g;
import m2.C0880v;
import n0.C0929h;
import n1.C0944e;
import n2.AbstractC0946A;
import n2.AbstractC0959k;
import n2.AbstractC0962n;
import o0.C0991a;
import o0.C0992b;
import p1.C1058a;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import s.AbstractC1166e;
import s.RunnableC1149B;
import t0.AbstractC1248f;
import u.C1271b;
import u0.AbstractC1296l0;
import u0.C1295l;
import u0.C1300n0;
import u0.C1319x0;
import u0.q1;
import u0.r1;
import v.C1346S;
import z.EnumC1407G;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1007b extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9562i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f9563j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f9564k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1007b(Object obj, int i2, Object obj2) {
        super(1);
        this.f9562i = i2;
        this.f9563j = obj;
        this.f9564k = obj2;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        int i2;
        long a3;
        int i3;
        int i4;
        InputConnection inputConnection;
        boolean z3;
        boolean z4;
        int i5 = 6;
        int i6 = 5;
        int i7 = 1;
        switch (this.f9562i) {
            case 0:
                ((C0929h) this.f9563j).f8942a.m((C1021i) this.f9564k);
                return C0880v.f8657a;
            case 1:
                C0992b c0992b = (C0992b) this.f9563j;
                AbstractC0962n.d(c0992b, (n0.r) obj);
                J.X0 x02 = AbstractC1296l0.q;
                M m3 = (M) this.f9564k;
                float d3 = ((u0.V0) AbstractC1248f.i(m3, x02)).d();
                long h2 = B2.a.h(d3, d3);
                if (O0.o.b(h2) <= 0.0f || O0.o.c(h2) <= 0.0f) {
                    AbstractC0946A.r("maximumVelocity should be a positive value. You specified=" + ((Object) O0.o.g(h2)));
                    throw null;
                }
                float b3 = O0.o.b(h2);
                g1.p pVar = c0992b.f9228a;
                float b4 = pVar.b(b3);
                float c3 = O0.o.c(h2);
                g1.p pVar2 = c0992b.f9229b;
                long h3 = B2.a.h(b4, pVar2.b(c3));
                C0991a[] c0991aArr = (C0991a[]) pVar.f7740e;
                AbstractC0959k.u(c0991aArr, null, 0, c0991aArr.length);
                pVar.f7739d = 0;
                C0991a[] c0991aArr2 = (C0991a[]) pVar2.f7740e;
                AbstractC0959k.u(c0991aArr2, null, 0, c0991aArr2.length);
                pVar2.f7739d = 0;
                c0992b.f9230c = 0L;
                L2.k kVar = m3.f9464A;
                if (kVar != null) {
                    N n3 = O.f9476a;
                    kVar.q(new C1046v(B2.a.h(Float.isNaN(O0.o.b(h3)) ? 0.0f : O0.o.b(h3), Float.isNaN(O0.o.c(h3)) ? 0.0f : O0.o.c(h3))));
                }
                return C0880v.f8657a;
            case 2:
                long j3 = ((C1042t) obj).f9682a;
                T t3 = (T) this.f9564k;
                long i8 = b0.c.i(t3.f9502J ? -1.0f : 1.0f, j3);
                X x2 = t3.F;
                N n4 = O.f9476a;
                ((O3) this.f9563j).a(x2 == X.f9518h ? b0.c.e(i8) : b0.c.d(i8));
                return C0880v.f8657a;
            case 3:
                long j4 = ((C1042t) obj).f9682a;
                if (((C0) this.f9564k).f9387d == X.f9519i) {
                    i2 = 1;
                    a3 = b0.c.a(j4, 0.0f, 1);
                } else {
                    i2 = 1;
                    a3 = b0.c.a(j4, 0.0f, 2);
                }
                C0 c02 = ((C1055z0) this.f9563j).f9724a;
                c02.f9390g = i2;
                n.j0 j0Var = c02.f9385b;
                if (j0Var == null || !(c02.f9384a.a() || c02.f9384a.c())) {
                    C0.a(c02, c02.f9391h, a3, 1);
                } else {
                    j0Var.b(a3, c02.f9390g, c02.f9393j);
                }
                return C0880v.f8657a;
            case 4:
                ((Number) obj).longValue();
                e1 e1Var = (e1) this.f9563j;
                float f3 = e1Var.f9593e;
                e1Var.f9593e = 0.0f;
                ((y2.c) this.f9564k).l(Float.valueOf(f3));
                return C0880v.f8657a;
            case AbstractC1166e.f10138f /* 5 */:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f9563j;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                ((J2.Z) this.f9564k).a(null);
                return C0880v.f8657a;
            case AbstractC1166e.f10136d /* 6 */:
                s.Z z5 = (s.Z) this.f9563j;
                int i9 = z5.f10109s;
                View view = (View) this.f9564k;
                if (i9 == 0) {
                    int i10 = AbstractC0542s.f7132a;
                    RunnableC1149B runnableC1149B = z5.f10110t;
                    AbstractC0535l.u(view, runnableC1149B);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(runnableC1149B);
                    AbstractC0542s.a(view, runnableC1149B);
                }
                z5.f10109s++;
                return new m.r0(z5, i6, view);
            case 7:
                O.m q = ((C1058a) this.f9563j).q(((Number) obj).intValue());
                List list = (List) q.f5121b;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i11 = q.f5120a;
                int i12 = 0;
                for (int i13 = 0; i13 < size; i13++) {
                    int i14 = (int) ((C1271b) list.get(i13)).f10667a;
                    arrayList.add(new C0865g(Integer.valueOf(i11), new O0.a(((u.m) this.f9564k).a(i12, i14))));
                    i11++;
                    i12 += i14;
                }
                return arrayList;
            case 8:
                AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
                List list2 = (List) this.f9563j;
                int size2 = list2.size();
                for (int i15 = 0; i15 < size2; i15 += i7) {
                    u.q qVar = (u.q) list2.get(i15);
                    if (qVar.f10769o == Integer.MIN_VALUE) {
                        throw new IllegalArgumentException("position() should be called first".toString());
                    }
                    List list3 = qVar.f10761g;
                    int size3 = list3.size();
                    int i16 = 0;
                    while (i16 < size3) {
                        AbstractC1103Q abstractC1103Q = (AbstractC1103Q) list3.get(i16);
                        boolean z6 = qVar.f10757c;
                        if (z6) {
                            int i17 = abstractC1103Q.f9835i;
                        } else {
                            int i18 = abstractC1103Q.f9834h;
                        }
                        long j5 = qVar.q;
                        qVar.f10764j.a(i16, qVar.f10756b);
                        if (qVar.f10759e) {
                            if (z6) {
                                i3 = size3;
                                i4 = (int) (j5 >> 32);
                            } else {
                                i3 = size3;
                                i4 = (qVar.f10769o - ((int) (j5 >> 32))) - (z6 ? abstractC1103Q.f9835i : abstractC1103Q.f9834h);
                            }
                            j5 = AbstractC0423a.m(i4, z6 ? (qVar.f10769o - ((int) (4294967295L & j5))) - (z6 ? abstractC1103Q.f9835i : abstractC1103Q.f9834h) : (int) (4294967295L & j5));
                        } else {
                            i3 = size3;
                        }
                        long c4 = O0.h.c(j5, qVar.f10762h);
                        if (z6) {
                            AbstractC1102P.k(abstractC1102P, abstractC1103Q, c4);
                        } else {
                            AbstractC1102P.i(abstractC1102P, abstractC1103Q, c4);
                        }
                        i16++;
                        size3 = i3;
                        i7 = 1;
                    }
                }
                ((InterfaceC0258c0) this.f9564k).getValue();
                return C0880v.f8657a;
            case AbstractC1166e.f10135c /* 9 */:
                Context context = (Context) this.f9563j;
                Context applicationContext = context.getApplicationContext();
                u0.P p3 = (u0.P) this.f9564k;
                applicationContext.registerComponentCallbacks(p3);
                return new m.r0(context, i5, p3);
            case AbstractC1166e.f10137e /* 10 */:
                Context context2 = (Context) this.f9563j;
                Context applicationContext2 = context2.getApplicationContext();
                u0.Q q3 = (u0.Q) this.f9564k;
                applicationContext2.registerComponentCallbacks(q3);
                return new m.r0(context2, 7, q3);
            case 11:
                return new C1319x0((B.G) this.f9563j, new C0944e(11, (u0.U) this.f9564k));
            case 12:
                C1319x0 c1319x0 = (C1319x0) this.f9563j;
                synchronized (c1319x0.f11252c) {
                    try {
                        c1319x0.f11254e = true;
                        L.d dVar = c1319x0.f11253d;
                        int i19 = dVar.f4620j;
                        if (i19 > 0) {
                            Object[] objArr = dVar.f4618h;
                            int i20 = 0;
                            do {
                                I0.p pVar3 = (I0.p) ((WeakReference) objArr[i20]).get();
                                if (pVar3 != null && (inputConnection = pVar3.f3914b) != null) {
                                    pVar3.a(inputConnection);
                                    pVar3.f3914b = null;
                                }
                                i20++;
                            } while (i20 < i19);
                        }
                        c1319x0.f11253d.g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ((u0.U) this.f9564k).f10978i.f3838a.d();
                return C0880v.f8657a;
            case 13:
                u0.Y y3 = (u0.Y) this.f9563j;
                Choreographer.FrameCallback frameCallback = (Choreographer.FrameCallback) this.f9564k;
                synchronized (y3.f11009l) {
                    y3.f11011n.remove(frameCallback);
                }
                return C0880v.f8657a;
            case 14:
                ((Choreographer) ((C0278m0) this.f9563j).f4158i).removeFrameCallback((Choreographer.FrameCallback) this.f9564k);
                return C0880v.f8657a;
            case AbstractC1166e.f10139g /* 15 */:
                C1295l c1295l = (C1295l) obj;
                r1 r1Var = (r1) this.f9563j;
                if (!r1Var.f11140j) {
                    C0472v e3 = c1295l.f11080a.e();
                    y2.e eVar = (y2.e) this.f9564k;
                    r1Var.f11142l = eVar;
                    if (r1Var.f11141k == null) {
                        r1Var.f11141k = e3;
                        e3.a(r1Var);
                    } else if (e3.f6909c.compareTo(EnumC0466o.f6900j) >= 0) {
                        r1Var.f11139i.c(new R.a(-2000640158, new q1(r1Var, eVar, i7), true));
                    }
                }
                return C0880v.f8657a;
            case 16:
                C1346S c1346s = (C1346S) this.f9563j;
                LinkedHashSet linkedHashSet = c1346s.f11313c;
                Object obj2 = this.f9564k;
                linkedHashSet.remove(obj2);
                return new m.r0(c1346s, 8, obj2);
            case 17:
                I0.z zVar = (I0.z) obj;
                if (!z2.h.a((I0.z) this.f9563j, zVar)) {
                    ((y2.c) this.f9564k).l(zVar);
                }
                return C0880v.f8657a;
            case 18:
                KeyEvent keyEvent = ((l0.b) obj).f8278a;
                if (((z.S) this.f9563j).a() == EnumC1407G.f11512i && keyEvent.getKeyCode() == 4 && C1.y.r(l0.c.D(keyEvent), 1)) {
                    ((D.X) this.f9564k).g(null);
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 19:
                KeyEvent keyEvent2 = ((l0.b) obj).f8278a;
                InputDevice device = keyEvent2.getDevice();
                if (device != null && device.supportsSource(513) && !device.isVirtual() && C1.y.r(l0.c.D(keyEvent2), 2) && keyEvent2.getSource() != 257) {
                    boolean i21 = z.N.i(keyEvent2, 19);
                    InterfaceC0431h interfaceC0431h = (InterfaceC0431h) this.f9563j;
                    if (i21) {
                        z4 = ((androidx.compose.ui.focus.b) interfaceC0431h).d(5);
                    } else if (z.N.i(keyEvent2, 20)) {
                        z4 = ((androidx.compose.ui.focus.b) interfaceC0431h).d(6);
                    } else if (z.N.i(keyEvent2, 21)) {
                        z4 = ((androidx.compose.ui.focus.b) interfaceC0431h).d(3);
                    } else if (z.N.i(keyEvent2, 22)) {
                        z4 = ((androidx.compose.ui.focus.b) interfaceC0431h).d(4);
                    } else if (z.N.i(keyEvent2, 23)) {
                        u0.R0 r02 = ((z.S) this.f9564k).f11545c;
                        if (r02 != null) {
                            ((C1300n0) r02).b();
                        }
                        z4 = true;
                    }
                    return Boolean.valueOf(z4);
                }
                z4 = false;
                return Boolean.valueOf(z4);
            default:
                return new m.r0((InterfaceC0258c0) this.f9563j, 9, (r.l) this.f9564k);
        }
    }
}
