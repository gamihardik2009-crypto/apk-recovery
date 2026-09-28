package u0;

import B1.RunnableC0015e;
import C0.C0024g;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.lifecycle.C0472v;
import androidx.lifecycle.EnumC0466o;
import androidx.lifecycle.InterfaceC0470t;
import b1.AbstractC0525b;
import c1.C0615h;
import com.example.bulksmsscheduler.R;
import j.AbstractC0753i;
import j.AbstractC0754j;
import j.AbstractC0755k;
import j.C0742H;
import j.C0751g;
import j.C0759o;
import j.C0760p;
import j.C0761q;
import j.C0762r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import m2.C0880v;
import n2.AbstractC0946A;
import n2.AbstractC0959k;
import n2.AbstractC0961m;
import n2.AbstractC0963o;
import n2.C0970v;
import t0.C1236E;

/* loaded from: classes.dex */
public final class G extends AbstractC0525b {

    /* renamed from: N, reason: collision with root package name */
    public static final C0760p f10862N;

    /* renamed from: A, reason: collision with root package name */
    public C0761q f10863A;

    /* renamed from: B, reason: collision with root package name */
    public final C0762r f10864B;

    /* renamed from: C, reason: collision with root package name */
    public final C0759o f10865C;

    /* renamed from: D, reason: collision with root package name */
    public final C0759o f10866D;
    public final String E;
    public final String F;

    /* renamed from: G, reason: collision with root package name */
    public final Q1.r f10867G;

    /* renamed from: H, reason: collision with root package name */
    public final C0761q f10868H;

    /* renamed from: I, reason: collision with root package name */
    public P0 f10869I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f10870J;

    /* renamed from: K, reason: collision with root package name */
    public final RunnableC0015e f10871K;

    /* renamed from: L, reason: collision with root package name */
    public final ArrayList f10872L;

    /* renamed from: M, reason: collision with root package name */
    public final E f10873M;

    /* renamed from: d, reason: collision with root package name */
    public final C1314v f10874d;

    /* renamed from: e, reason: collision with root package name */
    public int f10875e = Integer.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public final E f10876f = new E(this, 0);

    /* renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f10877g;

    /* renamed from: h, reason: collision with root package name */
    public long f10878h;

    /* renamed from: i, reason: collision with root package name */
    public final AccessibilityManagerAccessibilityStateChangeListenerC1316w f10879i;

    /* renamed from: j, reason: collision with root package name */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC1318x f10880j;

    /* renamed from: k, reason: collision with root package name */
    public List f10881k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f10882l;

    /* renamed from: m, reason: collision with root package name */
    public final K1.c f10883m;

    /* renamed from: n, reason: collision with root package name */
    public int f10884n;

    /* renamed from: o, reason: collision with root package name */
    public C0615h f10885o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10886p;
    public final C0761q q;

    /* renamed from: r, reason: collision with root package name */
    public final C0761q f10887r;

    /* renamed from: s, reason: collision with root package name */
    public final C0742H f10888s;

    /* renamed from: t, reason: collision with root package name */
    public final C0742H f10889t;

    /* renamed from: u, reason: collision with root package name */
    public int f10890u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f10891v;

    /* renamed from: w, reason: collision with root package name */
    public final C0751g f10892w;

    /* renamed from: x, reason: collision with root package name */
    public final L2.g f10893x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10894y;

    /* renamed from: z, reason: collision with root package name */
    public C f10895z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i2 = AbstractC0753i.f8004a;
        C0760p c0760p = new C0760p(32);
        int i3 = c0760p.f8022b;
        if (i3 < 0) {
            StringBuilder l3 = B1.t.l("Index ", i3, " must be in 0..");
            l3.append(c0760p.f8022b);
            throw new IndexOutOfBoundsException(l3.toString());
        }
        int i4 = i3 + 32;
        c0760p.b(i4);
        int[] iArr2 = c0760p.f8021a;
        int i5 = c0760p.f8022b;
        if (i3 != i5) {
            AbstractC0959k.p(iArr2, iArr2, i4, i3, i5);
        }
        AbstractC0959k.r(iArr, iArr2, i3, 0, 12);
        c0760p.f8022b += 32;
        f10862N = c0760p;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [u0.w] */
    /* JADX WARN: Type inference failed for: r2v5, types: [u0.x] */
    public G(C1314v c1314v) {
        this.f10874d = c1314v;
        Object systemService = c1314v.getContext().getSystemService("accessibility");
        z2.h.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f10877g = accessibilityManager;
        this.f10878h = 100L;
        this.f10879i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: u0.w
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z3) {
                G g3 = G.this;
                g3.f10881k = z3 ? g3.f10877g.getEnabledAccessibilityServiceList(-1) : C0970v.f9165h;
            }
        };
        this.f10880j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: u0.x
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z3) {
                G g3 = G.this;
                g3.f10881k = g3.f10877g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f10881k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f10882l = new Handler(Looper.getMainLooper());
        this.f10883m = new K1.c(this);
        this.f10884n = Integer.MIN_VALUE;
        this.q = new C0761q();
        this.f10887r = new C0761q();
        this.f10888s = new C0742H();
        this.f10889t = new C0742H();
        this.f10890u = -1;
        this.f10892w = new C0751g(0);
        this.f10893x = B2.a.c(1, 0, 6);
        this.f10894y = true;
        C0761q c0761q = AbstractC0754j.f8005a;
        z2.h.d(c0761q, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f10863A = c0761q;
        this.f10864B = new C0762r();
        this.f10865C = new C0759o();
        this.f10866D = new C0759o();
        this.E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.F = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f10867G = new Q1.r(3);
        this.f10868H = new C0761q();
        A0.q a3 = c1314v.getSemanticsOwner().a();
        z2.h.d(c0761q, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f10869I = new P0(a3, c0761q);
        c1314v.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1320y(0, this));
        this.f10871K = new RunnableC0015e(13, this);
        this.f10872L = new ArrayList();
        this.f10873M = new E(this, 1);
    }

    public static /* synthetic */ void C(G g3, int i2, int i3, Integer num, int i4) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        g3.B(i2, i3, num, null);
    }

    public static CharSequence L(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i2 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i2 = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i2);
                z2.h.d(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
        }
        return charSequence;
    }

    /* JADX WARN: Finally extract failed */
    public static final C0615h b(G g3, int i2) {
        InterfaceC0470t interfaceC0470t;
        C0472v e3;
        C1314v c1314v = g3.f10874d;
        Trace.beginSection("checkIfDestroyed");
        try {
            C1295l viewTreeOwners = c1314v.getViewTreeOwners();
            if (((viewTreeOwners == null || (interfaceC0470t = viewTreeOwners.f11080a) == null || (e3 = interfaceC0470t.e()) == null) ? null : e3.f6909c) == EnumC0466o.f6898h) {
                return null;
            }
            Trace.endSection();
            Trace.beginSection("createAccessibilityNodeInfoObject");
            try {
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
                C0615h c0615h = new C0615h(obtain);
                Trace.endSection();
                Trace.beginSection("calculateNodeWithAdjustedBounds");
                try {
                    Q0 q0 = (Q0) g3.m().e(i2);
                    if (q0 == null) {
                        return null;
                    }
                    Trace.beginSection("setParentForAccessibility");
                    int i3 = -1;
                    A0.q qVar = q0.f10968a;
                    try {
                        if (i2 == -1) {
                            Object parentForAccessibility = c1314v.getParentForAccessibility();
                            View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                            c0615h.f7300b = -1;
                            obtain.setParent(view);
                        } else {
                            A0.q j3 = qVar.j();
                            Integer valueOf = j3 != null ? Integer.valueOf(j3.f75g) : null;
                            if (valueOf == null) {
                                AbstractC0946A.s("semanticsNode " + i2 + " has null parent");
                                throw null;
                            }
                            int intValue = valueOf.intValue();
                            if (intValue != c1314v.getSemanticsOwner().a().f75g) {
                                i3 = intValue;
                            }
                            c0615h.f7300b = i3;
                            obtain.setParent(c1314v, i3);
                        }
                        Trace.endSection();
                        c0615h.f7301c = i2;
                        obtain.setSource(c1314v, i2);
                        Trace.beginSection("setBoundsInScreen");
                        try {
                            obtain.setBoundsInScreen(g3.d(q0));
                            Trace.endSection();
                            Trace.beginSection("populateAccessibilityNodeInfoProperties");
                            try {
                                g3.v(i2, c0615h, qVar);
                                return c0615h;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean n(A0.q qVar) {
        B0.a aVar = (B0.a) B1.C.T(qVar.f72d, A0.t.f91B);
        A0.x xVar = A0.t.f112s;
        A0.k kVar = qVar.f72d;
        A0.h hVar = (A0.h) B1.C.T(kVar, xVar);
        boolean z3 = true;
        boolean z4 = aVar != null;
        Object obj = kVar.f60h.get(A0.t.f90A);
        if (obj == null) {
            obj = null;
        }
        if (((Boolean) obj) == null) {
            return z4;
        }
        if (hVar != null && A0.h.a(hVar.f30a, 4)) {
            z3 = z4;
        }
        return z3;
    }

    public static C0024g p(A0.q qVar) {
        C0024g c0024g = (C0024g) B1.C.T(qVar.f72d, A0.t.f117x);
        List list = (List) B1.C.T(qVar.f72d, A0.t.f114u);
        return c0024g == null ? list != null ? (C0024g) AbstractC0961m.H(list) : null : c0024g;
    }

    public static String q(A0.q qVar) {
        C0024g c0024g;
        if (qVar == null) {
            return null;
        }
        A0.x xVar = A0.t.f95a;
        A0.k kVar = qVar.f72d;
        if (kVar.f60h.containsKey(xVar)) {
            return B1.C.Q((List) kVar.b(xVar), ",");
        }
        A0.x xVar2 = A0.t.f117x;
        LinkedHashMap linkedHashMap = kVar.f60h;
        if (linkedHashMap.containsKey(xVar2)) {
            C0024g c0024g2 = (C0024g) B1.C.T(kVar, xVar2);
            if (c0024g2 != null) {
                return c0024g2.f500a;
            }
            return null;
        }
        Object obj = linkedHashMap.get(A0.t.f114u);
        if (obj == null) {
            obj = null;
        }
        List list = (List) obj;
        if (list == null || (c0024g = (C0024g) AbstractC0961m.H(list)) == null) {
            return null;
        }
        return c0024g.f500a;
    }

    public static final boolean u(A0.i iVar, float f3) {
        y2.a aVar = iVar.f31a;
        return (f3 < 0.0f && ((Number) aVar.c()).floatValue() > 0.0f) || (f3 > 0.0f && ((Number) aVar.c()).floatValue() < ((Number) iVar.f32b.c()).floatValue());
    }

    public static final boolean w(A0.i iVar) {
        y2.a aVar = iVar.f31a;
        float floatValue = ((Number) aVar.c()).floatValue();
        boolean z3 = iVar.f33c;
        return (floatValue > 0.0f && !z3) || (((Number) aVar.c()).floatValue() < ((Number) iVar.f32b.c()).floatValue() && z3);
    }

    public static final boolean x(A0.i iVar) {
        y2.a aVar = iVar.f31a;
        float floatValue = ((Number) aVar.c()).floatValue();
        float floatValue2 = ((Number) iVar.f32b.c()).floatValue();
        boolean z3 = iVar.f33c;
        return (floatValue < floatValue2 && !z3) || (((Number) aVar.c()).floatValue() > 0.0f && z3);
    }

    public final boolean A(AccessibilityEvent accessibilityEvent) {
        if (!r()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f10886p = true;
        }
        try {
            return ((Boolean) this.f10876f.l(accessibilityEvent)).booleanValue();
        } finally {
            this.f10886p = false;
        }
    }

    public final boolean B(int i2, int i3, Integer num, List list) {
        if (i2 == Integer.MIN_VALUE || !r()) {
            return false;
        }
        AccessibilityEvent h2 = h(i2, i3);
        if (num != null) {
            h2.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            h2.setContentDescription(B1.C.Q(list, ","));
        }
        Trace.beginSection("sendEvent");
        try {
            return A(h2);
        } finally {
            Trace.endSection();
        }
    }

    public final void D(int i2, int i3, String str) {
        AccessibilityEvent h2 = h(y(i2), 32);
        h2.setContentChangeTypes(i3);
        if (str != null) {
            h2.getText().add(str);
        }
        A(h2);
    }

    public final void E(int i2) {
        C c3 = this.f10895z;
        if (c3 != null) {
            A0.q qVar = c3.f10828a;
            if (i2 != qVar.f75g) {
                return;
            }
            if (SystemClock.uptimeMillis() - c3.f10833f <= 1000) {
                AccessibilityEvent h2 = h(y(qVar.f75g), 131072);
                h2.setFromIndex(c3.f10831d);
                h2.setToIndex(c3.f10832e);
                h2.setAction(c3.f10829b);
                h2.setMovementGranularity(c3.f10830c);
                h2.getText().add(q(qVar));
                A(h2);
            }
        }
        this.f10895z = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:228:0x00c6, code lost:
    
        if (r5 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x05cb, code lost:
    
        if (r21 != false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x058c, code lost:
    
        if (r3 != null) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0591, code lost:
    
        if (r3 == null) goto L220;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(j.C0761q r40) {
        /*
            Method dump skipped, instructions count: 1579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.G.F(j.q):void");
    }

    public final void G(C1236E c1236e, C0762r c0762r) {
        A0.k o3;
        if (c1236e.D() && !this.f10874d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(c1236e)) {
            C0751g c0751g = this.f10892w;
            int i2 = c0751g.f8002j;
            for (int i3 = 0; i3 < i2; i3++) {
                if (N.u((C1236E) c0751g.f8001i[i3], c1236e)) {
                    return;
                }
            }
            Trace.beginSection("GetSemanticsNode");
            try {
                C1236E c1236e2 = null;
                if (!c1236e.f10378C.f(8)) {
                    c1236e = c1236e.s();
                    while (true) {
                        if (c1236e == null) {
                            c1236e = null;
                            break;
                        } else if (c1236e.f10378C.f(8)) {
                            break;
                        } else {
                            c1236e = c1236e.s();
                        }
                    }
                }
                if (c1236e != null && (o3 = c1236e.o()) != null) {
                    if (!o3.f61i) {
                        C1236E s3 = c1236e.s();
                        while (true) {
                            if (s3 == null) {
                                break;
                            }
                            A0.k o4 = s3.o();
                            if (o4 != null && o4.f61i) {
                                c1236e2 = s3;
                                break;
                            }
                            s3 = s3.s();
                        }
                        if (c1236e2 != null) {
                            c1236e = c1236e2;
                        }
                    }
                    int i4 = c1236e.f10388i;
                    Trace.endSection();
                    if (c0762r.a(i4)) {
                        C(this, y(i4), 2048, 1, 8);
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void H(C1236E c1236e) {
        if (c1236e.D() && !this.f10874d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(c1236e)) {
            int i2 = c1236e.f10388i;
            A0.i iVar = (A0.i) this.q.e(i2);
            A0.i iVar2 = (A0.i) this.f10887r.e(i2);
            if (iVar == null && iVar2 == null) {
                return;
            }
            AccessibilityEvent h2 = h(i2, 4096);
            if (iVar != null) {
                h2.setScrollX((int) ((Number) iVar.f31a.c()).floatValue());
                h2.setMaxScrollX((int) ((Number) iVar.f32b.c()).floatValue());
            }
            if (iVar2 != null) {
                h2.setScrollY((int) ((Number) iVar2.f31a.c()).floatValue());
                h2.setMaxScrollY((int) ((Number) iVar2.f32b.c()).floatValue());
            }
            A(h2);
        }
    }

    public final boolean I(A0.q qVar, int i2, int i3, boolean z3) {
        String q;
        A0.x xVar = A0.j.f42h;
        A0.k kVar = qVar.f72d;
        if (kVar.f60h.containsKey(xVar) && N.l(qVar)) {
            y2.f fVar = (y2.f) ((A0.a) kVar.b(xVar)).f17b;
            if (fVar != null) {
                return ((Boolean) fVar.i(Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z3))).booleanValue();
            }
            return false;
        }
        if ((i2 == i3 && i3 == this.f10890u) || (q = q(qVar)) == null) {
            return false;
        }
        if (i2 < 0 || i2 != i3 || i3 > q.length()) {
            i2 = -1;
        }
        this.f10890u = i2;
        boolean z4 = q.length() > 0;
        int i4 = qVar.f75g;
        A(i(y(i4), z4 ? Integer.valueOf(this.f10890u) : null, z4 ? Integer.valueOf(this.f10890u) : null, z4 ? Integer.valueOf(q.length()) : null, q));
        E(i4);
        return true;
    }

    public final void J() {
        C0759o c0759o = this.f10865C;
        c0759o.a();
        C0759o c0759o2 = this.f10866D;
        c0759o2.a();
        Q0 q0 = (Q0) m().e(-1);
        A0.q qVar = q0 != null ? q0.f10968a : null;
        z2.h.c(qVar);
        ArrayList K3 = K(N.n(qVar), AbstractC0963o.w(qVar));
        int u3 = AbstractC0963o.u(K3);
        int i2 = 1;
        if (1 > u3) {
            return;
        }
        while (true) {
            int i3 = ((A0.q) K3.get(i2 - 1)).f75g;
            int i4 = ((A0.q) K3.get(i2)).f75g;
            c0759o.f(i3, i4);
            c0759o2.f(i4, i3);
            if (i2 == u3) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce A[LOOP:1: B:8:0x002f->B:26:0x00ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1 A[EDGE_INSN: B:27:0x00d1->B:34:0x00d1 BREAK  A[LOOP:1: B:8:0x002f->B:26:0x00ce], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList K(boolean r18, java.util.ArrayList r19) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.G.K(boolean, java.util.ArrayList):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0143, code lost:
    
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0151, code lost:
    
        if (((r0 & ((~r0) << 6)) & (-9187201950435737472L)) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0153, code lost:
    
        r24 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M() {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.G.M():void");
    }

    @Override // b1.AbstractC0525b
    public final K1.c a(View view) {
        return this.f10883m;
    }

    public final void c(int i2, C0615h c0615h, String str, Bundle bundle) {
        A0.q qVar;
        AccessibilityNodeInfo accessibilityNodeInfo;
        RectF rectF;
        Q0 q0 = (Q0) m().e(i2);
        if (q0 == null || (qVar = q0.f10968a) == null) {
            return;
        }
        String q = q(qVar);
        boolean a3 = z2.h.a(str, this.E);
        AccessibilityNodeInfo accessibilityNodeInfo2 = c0615h.f7299a;
        if (a3) {
            C0759o c0759o = this.f10865C;
            int c3 = c0759o.c(i2);
            int i3 = c3 >= 0 ? c0759o.f8017c[c3] : -1;
            if (i3 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, i3);
                return;
            }
            return;
        }
        if (z2.h.a(str, this.F)) {
            C0759o c0759o2 = this.f10866D;
            int c4 = c0759o2.c(i2);
            int i4 = c4 >= 0 ? c0759o2.f8017c[c4] : -1;
            if (i4 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, i4);
                return;
            }
            return;
        }
        A0.x xVar = A0.j.f35a;
        A0.k kVar = qVar.f72d;
        if (!kVar.f60h.containsKey(xVar) || bundle == null || !z2.h.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            A0.x xVar2 = A0.t.f113t;
            LinkedHashMap linkedHashMap = kVar.f60h;
            if (!linkedHashMap.containsKey(xVar2) || bundle == null || !z2.h.a(str, "androidx.compose.ui.semantics.testTag")) {
                if (z2.h.a(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo2.getExtras().putInt(str, qVar.f75g);
                    return;
                }
                return;
            } else {
                Object obj = linkedHashMap.get(xVar2);
                String str2 = (String) (obj != null ? obj : null);
                if (str2 != null) {
                    accessibilityNodeInfo2.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i6 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i6 > 0 && i5 >= 0) {
            if (i5 < (q != null ? q.length() : Integer.MAX_VALUE)) {
                C0.H s3 = N.s(kVar);
                if (s3 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i7 = 0;
                while (i7 < i6) {
                    int i8 = i5 + i7;
                    if (i8 >= s3.f461a.f451a.f500a.length()) {
                        arrayList.add(null);
                        accessibilityNodeInfo = accessibilityNodeInfo2;
                    } else {
                        b0.d b3 = s3.b(i8);
                        t0.Z c5 = qVar.c();
                        long j3 = 0;
                        if (c5 != null) {
                            if (!c5.T0().f5869t) {
                                c5 = null;
                            }
                            if (c5 != null) {
                                j3 = c5.K(0L);
                            }
                        }
                        b0.d i9 = b3.i(j3);
                        b0.d e3 = qVar.e();
                        b0.d e4 = i9.g(e3) ? i9.e(e3) : null;
                        if (e4 != null) {
                            long e5 = K1.f.e(e4.f7060a, e4.f7061b);
                            C1314v c1314v = this.f10874d;
                            long s4 = c1314v.s(e5);
                            accessibilityNodeInfo = accessibilityNodeInfo2;
                            long s5 = c1314v.s(K1.f.e(e4.f7062c, e4.f7063d));
                            rectF = new RectF(b0.c.d(s4), b0.c.e(s4), b0.c.d(s5), b0.c.e(s5));
                        } else {
                            accessibilityNodeInfo = accessibilityNodeInfo2;
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i7++;
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                }
                accessibilityNodeInfo2.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect d(Q0 q0) {
        Rect rect = q0.f10969b;
        long e3 = K1.f.e(rect.left, rect.top);
        C1314v c1314v = this.f10874d;
        long s3 = c1314v.s(e3);
        long s4 = c1314v.s(K1.f.e(rect.right, rect.bottom));
        return new Rect((int) Math.floor(b0.c.d(s3)), (int) Math.floor(b0.c.e(s3)), (int) Math.ceil(b0.c.d(s4)), (int) Math.ceil(b0.c.e(s4)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #3 {all -> 0x0048, blocks: (B:15:0x00e5, B:16:0x005e, B:21:0x0071, B:23:0x0079, B:54:0x00ea, B:55:0x00ed, B:59:0x0044, B:13:0x002c, B:24:0x0081, B:27:0x0089, B:29:0x008e, B:32:0x009c, B:35:0x00a7, B:38:0x00ae, B:39:0x00b1, B:42:0x00b3, B:43:0x00b6, B:45:0x00b7, B:47:0x00be, B:48:0x00c7, B:31:0x0099, B:34:0x00a4), top: B:7:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00e2 -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(q2.InterfaceC1073d r13) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.G.e(q2.d):java.lang.Object");
    }

    public final boolean f(boolean z3, int i2, long j3) {
        A0.x xVar;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        int i3;
        A0.i iVar;
        int i4 = 0;
        if (!z2.h.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        C0761q m3 = m();
        if (!b0.c.b(j3, 9205357640488583168L) && b0.c.f(j3)) {
            if (z3) {
                xVar = A0.t.f110p;
            } else {
                if (z3) {
                    throw new J2.r();
                }
                xVar = A0.t.f109o;
            }
            Object[] objArr3 = m3.f8025c;
            long[] jArr3 = m3.f8023a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i5 = 0;
                boolean z4 = false;
                while (true) {
                    long j4 = jArr3[i5];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = i4;
                        while (i8 < i7) {
                            if ((j4 & 255) < 128) {
                                Q0 q0 = (Q0) objArr3[(i5 << 3) + i8];
                                Rect rect = q0.f10969b;
                                jArr2 = jArr3;
                                objArr2 = objArr3;
                                if ((b0.c.d(j3) >= ((float) rect.left) && b0.c.d(j3) < ((float) rect.right) && b0.c.e(j3) >= ((float) rect.top) && b0.c.e(j3) < ((float) rect.bottom)) && (iVar = (A0.i) B1.C.T(q0.f10968a.f72d, xVar)) != null) {
                                    boolean z5 = iVar.f33c;
                                    int i9 = z5 ? -i2 : i2;
                                    y2.a aVar = iVar.f31a;
                                    if ((i2 != 0 || !z5) && i9 >= 0 ? ((Number) aVar.c()).floatValue() < ((Number) iVar.f32b.c()).floatValue() : ((Number) aVar.c()).floatValue() > 0.0f) {
                                        z4 = true;
                                    }
                                }
                                i3 = 8;
                            } else {
                                jArr2 = jArr3;
                                objArr2 = objArr3;
                                i3 = i6;
                            }
                            j4 >>= i3;
                            i8++;
                            i6 = i3;
                            jArr3 = jArr2;
                            objArr3 = objArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr3;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        objArr = objArr3;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    i4 = 0;
                }
                return z4;
            }
        }
        return false;
    }

    public final void g() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (r()) {
                z(this.f10874d.getSemanticsOwner().a(), this.f10869I);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                F(m());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    M();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent h(int i2, int i3) {
        Q0 q0;
        C1314v c1314v = this.f10874d;
        Trace.beginSection("obtainAccessibilityEvent");
        try {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
            Trace.endSection();
            obtain.setEnabled(true);
            obtain.setClassName("android.view.View");
            Trace.beginSection("event.packageName");
            try {
                obtain.setPackageName(c1314v.getContext().getPackageName());
                Trace.endSection();
                Trace.beginSection("event.setSource");
                try {
                    obtain.setSource(c1314v, i2);
                    Trace.endSection();
                    if (r() && (q0 = (Q0) m().e(i2)) != null) {
                        obtain.setPassword(q0.f10968a.f72d.f60h.containsKey(A0.t.f92C));
                    }
                    return obtain;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent i(int i2, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent h2 = h(i2, 8192);
        if (num != null) {
            h2.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            h2.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            h2.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            h2.getText().add(charSequence);
        }
        return h2;
    }

    public final void j(A0.q qVar, ArrayList arrayList, C0761q c0761q) {
        boolean n3 = N.n(qVar);
        Object obj = qVar.f72d.f60h.get(A0.t.f106l);
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i2 = qVar.f75g;
        if ((booleanValue || s(qVar)) && m().c(i2)) {
            arrayList.add(qVar);
        }
        if (booleanValue) {
            c0761q.g(i2, K(n3, AbstractC0961m.Y(A0.q.h(qVar, false, 7))));
            return;
        }
        List h2 = A0.q.h(qVar, false, 7);
        int size = h2.size();
        for (int i3 = 0; i3 < size; i3++) {
            j((A0.q) h2.get(i3), arrayList, c0761q);
        }
    }

    public final int k(A0.q qVar) {
        A0.k kVar = qVar.f72d;
        if (!kVar.f60h.containsKey(A0.t.f95a)) {
            A0.x xVar = A0.t.f118y;
            A0.k kVar2 = qVar.f72d;
            if (kVar2.f60h.containsKey(xVar)) {
                return (int) (4294967295L & ((C0.J) kVar2.b(xVar)).f473a);
            }
        }
        return this.f10890u;
    }

    public final int l(A0.q qVar) {
        A0.k kVar = qVar.f72d;
        if (!kVar.f60h.containsKey(A0.t.f95a)) {
            A0.x xVar = A0.t.f118y;
            A0.k kVar2 = qVar.f72d;
            if (kVar2.f60h.containsKey(xVar)) {
                return (int) (((C0.J) kVar2.b(xVar)).f473a >> 32);
            }
        }
        return this.f10890u;
    }

    public final C0761q m() {
        if (this.f10894y) {
            this.f10894y = false;
            Trace.beginSection("generateCurrentSemanticsNodes");
            try {
                C0761q q = N.q(this.f10874d.getSemanticsOwner());
                Trace.endSection();
                this.f10863A = q;
                if (r()) {
                    Trace.beginSection("setTraversalValues");
                    try {
                        J();
                    } finally {
                    }
                }
            } finally {
            }
        }
        return this.f10863A;
    }

    public final String o(A0.q qVar) {
        Object T3 = B1.C.T(qVar.f72d, A0.t.f96b);
        A0.x xVar = A0.t.f91B;
        A0.k kVar = qVar.f72d;
        B0.a aVar = (B0.a) B1.C.T(kVar, xVar);
        A0.x xVar2 = A0.t.f112s;
        LinkedHashMap linkedHashMap = kVar.f60h;
        Object obj = linkedHashMap.get(xVar2);
        Object obj2 = null;
        if (obj == null) {
            obj = null;
        }
        A0.h hVar = (A0.h) obj;
        C1314v c1314v = this.f10874d;
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2 && T3 == null) {
                        T3 = c1314v.getContext().getResources().getString(R.string.indeterminate);
                    }
                } else if (hVar != null && A0.h.a(hVar.f30a, 2) && T3 == null) {
                    T3 = c1314v.getContext().getResources().getString(R.string.state_off);
                }
            } else if (hVar != null && A0.h.a(hVar.f30a, 2) && T3 == null) {
                T3 = c1314v.getContext().getResources().getString(R.string.state_on);
            }
        }
        Object obj3 = linkedHashMap.get(A0.t.f90A);
        if (obj3 == null) {
            obj3 = null;
        }
        Boolean bool = (Boolean) obj3;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((hVar == null || !A0.h.a(hVar.f30a, 4)) && T3 == null) {
                T3 = booleanValue ? c1314v.getContext().getResources().getString(R.string.selected) : c1314v.getContext().getResources().getString(R.string.not_selected);
            }
        }
        Object obj4 = linkedHashMap.get(A0.t.f97c);
        if (obj4 == null) {
            obj4 = null;
        }
        A0.g gVar = (A0.g) obj4;
        if (gVar != null) {
            if (gVar != A0.g.f26d) {
                if (T3 == null) {
                    E2.a aVar2 = gVar.f28b;
                    float f3 = aVar2.f1075b;
                    float f4 = aVar2.f1074a;
                    float f5 = f3 - f4 == 0.0f ? 0.0f : (gVar.f27a - f4) / (aVar2.f1075b - f4);
                    if (f5 < 0.0f) {
                        f5 = 0.0f;
                    }
                    if (f5 > 1.0f) {
                        f5 = 1.0f;
                    }
                    T3 = c1314v.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(f5 == 0.0f ? 0 : f5 == 1.0f ? 100 : B1.C.C(Math.round(f5 * 100), 1, 99)));
                }
            } else if (T3 == null) {
                T3 = c1314v.getContext().getResources().getString(R.string.in_progress);
            }
        }
        A0.x xVar3 = A0.t.f117x;
        if (linkedHashMap.containsKey(xVar3)) {
            A0.k i2 = new A0.q(qVar.f69a, true, qVar.f71c, kVar).i();
            Collection collection = (Collection) B1.C.T(i2, A0.t.f95a);
            if (collection == null || collection.isEmpty()) {
                A0.x xVar4 = A0.t.f114u;
                LinkedHashMap linkedHashMap2 = i2.f60h;
                Object obj5 = linkedHashMap2.get(xVar4);
                if (obj5 == null) {
                    obj5 = null;
                }
                Collection collection2 = (Collection) obj5;
                if (collection2 == null || collection2.isEmpty()) {
                    Object obj6 = linkedHashMap2.get(xVar3);
                    if (obj6 == null) {
                        obj6 = null;
                    }
                    CharSequence charSequence = (CharSequence) obj6;
                    if (charSequence == null || charSequence.length() == 0) {
                        obj2 = c1314v.getContext().getResources().getString(R.string.state_empty);
                    }
                }
            }
            T3 = obj2;
        }
        return (String) T3;
    }

    public final boolean r() {
        return this.f10877g.isEnabled() && (this.f10881k.isEmpty() ^ true);
    }

    public final boolean s(A0.q qVar) {
        List list = (List) B1.C.T(qVar.f72d, A0.t.f95a);
        boolean z3 = ((list != null ? (String) AbstractC0961m.H(list) : null) == null && p(qVar) == null && o(qVar) == null && !n(qVar)) ? false : true;
        if (qVar.f72d.f61i) {
            return true;
        }
        return qVar.n() && z3;
    }

    public final void t(C1236E c1236e) {
        if (this.f10892w.add(c1236e)) {
            this.f10893x.q(C0880v.f8657a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x081d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0a67  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0a71  */
    /* JADX WARN: Removed duplicated region for block: B:458:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0a6d  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0a46  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0a27  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x088c  */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r2v75, types: [n2.v] */
    /* JADX WARN: Type inference failed for: r2v76, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v77, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(int r32, c1.C0615h r33, A0.q r34) {
        /*
            Method dump skipped, instructions count: 2681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.G.v(int, c1.h, A0.q):void");
    }

    public final int y(int i2) {
        if (i2 == this.f10874d.getSemanticsOwner().a().f75g) {
            return -1;
        }
        return i2;
    }

    public final void z(A0.q qVar, P0 p02) {
        int[] iArr = AbstractC0755k.f8006a;
        C0762r c0762r = new C0762r();
        List h2 = A0.q.h(qVar, true, 4);
        int size = h2.size();
        int i2 = 0;
        while (true) {
            C1236E c1236e = qVar.f71c;
            if (i2 >= size) {
                C0762r c0762r2 = p02.f10966b;
                int[] iArr2 = c0762r2.f8030b;
                long[] jArr = c0762r2.f8029a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j3 = jArr[i3];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((j3 & 255) < 128 && !c0762r.c(iArr2[(i3 << 3) + i5])) {
                                    t(c1236e);
                                    return;
                                }
                                j3 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                List h3 = A0.q.h(qVar, true, 4);
                int size2 = h3.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    A0.q qVar2 = (A0.q) h3.get(i6);
                    if (m().b(qVar2.f75g)) {
                        Object e3 = this.f10868H.e(qVar2.f75g);
                        z2.h.c(e3);
                        z(qVar2, (P0) e3);
                    }
                }
                return;
            }
            A0.q qVar3 = (A0.q) h2.get(i2);
            if (m().b(qVar3.f75g)) {
                C0762r c0762r3 = p02.f10966b;
                int i7 = qVar3.f75g;
                if (!c0762r3.c(i7)) {
                    t(c1236e);
                    return;
                }
                c0762r.a(i7);
            }
            i2++;
        }
    }
}
