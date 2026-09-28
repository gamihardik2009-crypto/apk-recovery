package B1;

import C0.C0024g;
import J2.T;
import J2.Z;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0472v;
import androidx.lifecycle.EnumC0465n;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b.AbstractActivityC0489m;
import b.ViewTreeObserverOnDrawListenerC0485i;
import j.C0761q;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m2.InterfaceC0862d;
import n2.AbstractC0946A;
import n2.AbstractC0961m;
import s.AbstractC1166e;
import u0.C1314v;
import u0.P0;
import u0.Q0;

/* renamed from: B1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0015e implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f283h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f284i;

    public /* synthetic */ RunnableC0015e(int i2, Object obj) {
        this.f283h = i2;
        this.f284i = obj;
    }

    private final void a() {
        g1.q qVar = (g1.q) this.f284i;
        synchronized (qVar.f7747k) {
            try {
                if (qVar.f7751o == null) {
                    return;
                }
                try {
                    Z0.b d3 = qVar.d();
                    int i2 = d3.f6397e;
                    if (i2 == 2) {
                        synchronized (qVar.f7747k) {
                        }
                    }
                    if (i2 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                    }
                    try {
                        int i3 = Y0.g.f6237a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        C1.b bVar = qVar.f7746j;
                        Context context = qVar.f7744h;
                        bVar.getClass();
                        Typeface o3 = W0.e.f5896a.o(context, new Z0.b[]{d3}, 0);
                        MappedByteBuffer J3 = K1.f.J(qVar.f7744h, d3.f6393a);
                        if (J3 == null || o3 == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        try {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            K1.i iVar = new K1.i(o3, B2.a.A(J3));
                            Trace.endSection();
                            Trace.endSection();
                            synchronized (qVar.f7747k) {
                                try {
                                    l0.c cVar = qVar.f7751o;
                                    if (cVar != null) {
                                        cVar.I(iVar);
                                    }
                                } finally {
                                }
                            }
                            qVar.a();
                        } finally {
                            int i4 = Y0.g.f6237a;
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (qVar.f7747k) {
                        try {
                            l0.c cVar2 = qVar.f7751o;
                            if (cVar2 != null) {
                                cVar2.H(th2);
                            }
                            qVar.a();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Boolean bool;
        Boolean bool2;
        int i2;
        C0761q c0761q;
        int[] iArr;
        int i3;
        C0761q c0761q2;
        int[] iArr2;
        int i4;
        int[] iArr3;
        C0024g c0024g;
        int i5 = 4;
        A0.q qVar = null;
        switch (this.f283h) {
            case 0:
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.f284i;
                z2.h.f(coroutineWorker, "this$0");
                if (coroutineWorker.f6933m.f4781a instanceof M1.a) {
                    coroutineWorker.f6932l.a(null);
                    return;
                }
                return;
            case 1:
                G.r.setRippleState$lambda$2((G.r) this.f284i);
                return;
            case 2:
                I0.C c3 = (I0.C) this.f284i;
                c3.f3858n = null;
                L.d dVar = c3.f3857m;
                int i6 = dVar.f4620j;
                if (i6 > 0) {
                    Object[] objArr = dVar.f4618h;
                    int i7 = 0;
                    Boolean bool3 = null;
                    bool2 = null;
                    do {
                        I0.B b3 = (I0.B) objArr[i7];
                        int ordinal = b3.ordinal();
                        if (ordinal == 0) {
                            bool3 = Boolean.TRUE;
                        } else if (ordinal != 1) {
                            if ((ordinal == 2 || ordinal == 3) && !z2.h.a(bool3, Boolean.FALSE)) {
                                bool2 = Boolean.valueOf(b3 == I0.B.f3842j);
                            }
                            i7++;
                        } else {
                            bool3 = Boolean.FALSE;
                        }
                        bool2 = bool3;
                        i7++;
                    } while (i7 < i6);
                    bool = bool3;
                } else {
                    bool = null;
                    bool2 = null;
                }
                dVar.g();
                boolean a3 = z2.h.a(bool, Boolean.TRUE);
                Q1.r rVar = c3.f3846b;
                if (a3) {
                    ((InputMethodManager) ((InterfaceC0862d) rVar.f5323c).getValue()).restartInput((View) rVar.f5322b);
                }
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        ((B.F) ((B.F) rVar.f5324d).f165i).G();
                    } else {
                        ((B.F) ((B.F) rVar.f5324d).f165i).w();
                    }
                }
                if (z2.h.a(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((InterfaceC0862d) rVar.f5323c).getValue()).restartInput((View) rVar.f5322b);
                    return;
                }
                return;
            case 3:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f284i;
                z2.h.f(constraintTrackingWorker, "this$0");
                if (constraintTrackingWorker.f6968o.f4781a instanceof M1.a) {
                    return;
                }
                Object obj = constraintTrackingWorker.f302i.f6938b.f293a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                String str = obj instanceof String ? (String) obj : null;
                s d3 = s.d();
                z2.h.e(d3, "get()");
                if (str == null || str.length() == 0) {
                    d3.b(O1.a.f5157a, "No worker to delegate to.");
                    M1.k kVar = constraintTrackingWorker.f6968o;
                    z2.h.e(kVar, "future");
                    kVar.j(new n());
                    return;
                }
                G g3 = constraintTrackingWorker.f302i.f6941e;
                Context context = constraintTrackingWorker.f301h;
                WorkerParameters workerParameters = constraintTrackingWorker.f6965l;
                g3.getClass();
                r a4 = G.a(context, str, workerParameters);
                constraintTrackingWorker.f6969p = a4;
                if (a4 == null) {
                    d3.a(O1.a.f5157a, "No worker to delegate to.");
                    M1.k kVar2 = constraintTrackingWorker.f6968o;
                    z2.h.e(kVar2, "future");
                    kVar2.j(new n());
                    return;
                }
                C1.w o02 = C1.w.o0(constraintTrackingWorker.f301h);
                K1.q v3 = o02.f690h.v();
                String uuid = constraintTrackingWorker.f302i.f6937a.toString();
                z2.h.e(uuid, "id.toString()");
                K1.o i8 = v3.i(uuid);
                if (i8 == null) {
                    M1.k kVar3 = constraintTrackingWorker.f6968o;
                    z2.h.e(kVar3, "future");
                    String str2 = O1.a.f5157a;
                    kVar3.j(new n());
                    return;
                }
                I1.l lVar = o02.f697o;
                z2.h.e(lVar, "workManagerImpl.trackers");
                G1.i iVar = new G1.i(lVar);
                T t3 = o02.f691i.f5011b;
                z2.h.e(t3, "workManagerImpl.workTask…r.taskCoroutineDispatcher");
                constraintTrackingWorker.f6968o.a(new RunnableC0015e(i5, G1.k.a(iVar, i8, t3, constraintTrackingWorker)), new L1.q());
                if (!iVar.b(i8)) {
                    d3.a(O1.a.f5157a, "Constraints not met for delegate " + str + ". Requesting retry.");
                    M1.k kVar4 = constraintTrackingWorker.f6968o;
                    z2.h.e(kVar4, "future");
                    kVar4.j(new o());
                    return;
                }
                d3.a(O1.a.f5157a, "Constraints met for delegate ".concat(str));
                try {
                    r rVar2 = constraintTrackingWorker.f6969p;
                    z2.h.c(rVar2);
                    M1.k d4 = rVar2.d();
                    z2.h.e(d4, "delegate!!.startWork()");
                    d4.a(new C1.z(constraintTrackingWorker, i5, d4), constraintTrackingWorker.f302i.f6939c);
                    return;
                } catch (Throwable th) {
                    String str3 = O1.a.f5157a;
                    String str4 = "Delegated worker " + str + " threw exception in startWork.";
                    if (d3.f307a <= 3) {
                        Log.d(str3, str4, th);
                    }
                    synchronized (constraintTrackingWorker.f6966m) {
                        try {
                            if (!constraintTrackingWorker.f6967n) {
                                M1.k kVar5 = constraintTrackingWorker.f6968o;
                                z2.h.e(kVar5, "future");
                                kVar5.j(new n());
                                return;
                            } else {
                                d3.a(str3, "Constraints were unmet, Retrying.");
                                M1.k kVar6 = constraintTrackingWorker.f6968o;
                                z2.h.e(kVar6, "future");
                                kVar6.j(new o());
                                return;
                            }
                        } finally {
                        }
                    }
                }
            case 4:
                Z z3 = (Z) this.f284i;
                z2.h.f(z3, "$job");
                z3.a(null);
                return;
            case AbstractC1166e.f10138f /* 5 */:
                X.c cVar = (X.c) this.f284i;
                if (cVar.h()) {
                    C1314v c1314v = cVar.f6185h;
                    c1314v.t(true);
                    cVar.l(c1314v.getSemanticsOwner().a(), cVar.f6198v);
                    cVar.j(c1314v.getSemanticsOwner().a(), cVar.f6198v);
                    C0761q g4 = cVar.g();
                    int[] iArr4 = g4.f8024b;
                    long[] jArr = g4.f8023a;
                    int length = jArr.length - 2;
                    C0761q c0761q3 = cVar.f6197u;
                    long j3 = 255;
                    int i9 = 8;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j4 = jArr[i10];
                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                int i12 = 0;
                                while (i12 < i11) {
                                    if ((j4 & j3) < 128) {
                                        int i13 = iArr4[(i10 << 3) + i12];
                                        P0 p02 = (P0) c0761q3.e(i13);
                                        Q0 q0 = (Q0) g4.e(i13);
                                        A0.q qVar2 = q0 != null ? q0.f10968a : qVar;
                                        if (qVar2 == null) {
                                            AbstractC0946A.s("no value for specified key");
                                            throw null;
                                        }
                                        int i14 = qVar2.f75g;
                                        A0.k kVar7 = qVar2.f72d;
                                        if (p02 == null) {
                                            Iterator it = kVar7.iterator();
                                            while (it.hasNext()) {
                                                Object key = ((Map.Entry) it.next()).getKey();
                                                C0761q c0761q4 = g4;
                                                A0.x xVar = A0.t.f114u;
                                                if (z2.h.a(key, xVar)) {
                                                    Object obj2 = kVar7.f60h.get(xVar);
                                                    if (obj2 == null) {
                                                        obj2 = null;
                                                    }
                                                    List list = (List) obj2;
                                                    cVar.k(String.valueOf(list != null ? (C0024g) AbstractC0961m.H(list) : null), i14);
                                                }
                                                g4 = c0761q4;
                                            }
                                            c0761q2 = g4;
                                        } else {
                                            c0761q2 = g4;
                                            Iterator it2 = kVar7.iterator();
                                            while (it2.hasNext()) {
                                                A0.x xVar2 = (A0.x) ((Map.Entry) it2.next()).getKey();
                                                Iterator it3 = it2;
                                                A0.x xVar3 = A0.t.f114u;
                                                if (z2.h.a(xVar2, xVar3)) {
                                                    List list2 = (List) C.T(p02.f10965a, xVar3);
                                                    if (list2 != null) {
                                                        c0024g = (C0024g) AbstractC0961m.H(list2);
                                                        iArr3 = iArr4;
                                                    } else {
                                                        iArr3 = iArr4;
                                                        c0024g = null;
                                                    }
                                                    Object obj3 = kVar7.f60h.get(xVar3);
                                                    if (obj3 == null) {
                                                        obj3 = null;
                                                    }
                                                    List list3 = (List) obj3;
                                                    C0024g c0024g2 = list3 != null ? (C0024g) AbstractC0961m.H(list3) : null;
                                                    if (!z2.h.a(c0024g, c0024g2)) {
                                                        cVar.k(String.valueOf(c0024g2), i14);
                                                    }
                                                    it2 = it3;
                                                    iArr4 = iArr3;
                                                } else {
                                                    it2 = it3;
                                                }
                                            }
                                        }
                                        iArr2 = iArr4;
                                        i4 = 8;
                                    } else {
                                        c0761q2 = g4;
                                        iArr2 = iArr4;
                                        i4 = i9;
                                    }
                                    j4 >>= i4;
                                    i12++;
                                    i9 = i4;
                                    g4 = c0761q2;
                                    iArr4 = iArr2;
                                    qVar = null;
                                    j3 = 255;
                                }
                                int i15 = i9;
                                c0761q = g4;
                                iArr = iArr4;
                                i3 = 1;
                                if (i11 != i15) {
                                }
                            } else {
                                c0761q = g4;
                                iArr = iArr4;
                                i3 = 1;
                            }
                            if (i10 != length) {
                                i10 += i3;
                                g4 = c0761q;
                                iArr4 = iArr;
                                i9 = 8;
                                qVar = null;
                                j3 = 255;
                            }
                        }
                    }
                    c0761q3.a();
                    C0761q g5 = cVar.g();
                    int[] iArr5 = g5.f8024b;
                    Object[] objArr2 = g5.f8025c;
                    long[] jArr2 = g5.f8023a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i16 = 0;
                        while (true) {
                            long j5 = jArr2[i16];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                for (int i18 = 0; i18 < i17; i18++) {
                                    if ((j5 & 255) < 128) {
                                        int i19 = (i16 << 3) + i18;
                                        c0761q3.g(iArr5[i19], new P0(((Q0) objArr2[i19]).f10968a, cVar.g()));
                                    }
                                    j5 >>= 8;
                                }
                                i2 = 1;
                                if (i17 != 8) {
                                }
                            } else {
                                i2 = 1;
                            }
                            if (i16 != length2) {
                                i16 += i2;
                            }
                        }
                    }
                    cVar.f6198v = new P0(c1314v.getSemanticsOwner().a(), cVar.g());
                    cVar.f6199w = false;
                    return;
                }
                return;
            case AbstractC1166e.f10136d /* 6 */:
                androidx.lifecycle.D d5 = (androidx.lifecycle.D) this.f284i;
                z2.h.f(d5, "this$0");
                int i20 = d5.f6810i;
                C0472v c0472v = d5.f6814m;
                if (i20 == 0) {
                    d5.f6811j = true;
                    c0472v.d(EnumC0465n.ON_PAUSE);
                }
                if (d5.f6809h == 0 && d5.f6811j) {
                    c0472v.d(EnumC0465n.ON_STOP);
                    d5.f6812k = true;
                    return;
                }
                return;
            case 7:
                ViewTreeObserverOnDrawListenerC0485i viewTreeObserverOnDrawListenerC0485i = (ViewTreeObserverOnDrawListenerC0485i) this.f284i;
                z2.h.f(viewTreeObserverOnDrawListenerC0485i, "this$0");
                Runnable runnable = viewTreeObserverOnDrawListenerC0485i.f6983i;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0485i.f6983i = null;
                    return;
                }
                return;
            case 8:
                AbstractActivityC0489m abstractActivityC0489m = (AbstractActivityC0489m) this.f284i;
                z2.h.f(abstractActivityC0489m, "this$0");
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e3) {
                    if (!z2.h.a(e3.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e3;
                    }
                    return;
                } catch (NullPointerException e4) {
                    if (!z2.h.a(e4.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e4;
                    }
                    return;
                }
            case AbstractC1166e.f10135c /* 9 */:
                R0.u.a((R0.u) this.f284i);
                return;
            case AbstractC1166e.f10137e /* 10 */:
                View view = (View) this.f284i;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 11:
                a();
                return;
            case 12:
                C1314v c1314v2 = (C1314v) this.f284i;
                c1314v2.f11226z0 = false;
                MotionEvent motionEvent = c1314v2.f11215t0;
                z2.h.c(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
                }
                c1314v2.G(motionEvent);
                return;
            default:
                u0.G g6 = (u0.G) this.f284i;
                Trace.beginSection("measureAndLayout");
                try {
                    g6.f10874d.t(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        g6.g();
                        Trace.endSection();
                        g6.f10870J = false;
                        return;
                    } finally {
                    }
                } finally {
                }
        }
    }
}
