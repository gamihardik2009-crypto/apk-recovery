package u0;

import B1.RunnableC0015e;
import C0.C0018a;
import H.C0136k1;
import J.C0257c;
import J.C0274k0;
import J.C0292u;
import T.C0374b;
import a.AbstractC0423a;
import a0.AbstractC0427d;
import a0.C0425b;
import a0.C0428e;
import a0.C0430g;
import a0.C0442s;
import a0.InterfaceC0431h;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.lifecycle.C0472v;
import androidx.lifecycle.InterfaceC0456e;
import androidx.lifecycle.InterfaceC0470t;
import b1.AbstractC0542s;
import b1.AbstractC0543t;
import c0.AbstractC0571K;
import c0.C0565E;
import c0.C0584c;
import c0.C0587f;
import c0.C0601t;
import c0.InterfaceC0561A;
import f0.C0663b;
import j.C0736B;
import j0.C0772b;
import j0.InterfaceC0771a;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import k0.C0780a;
import k0.C0782c;
import k0.InterfaceC0781b;
import m.AbstractC0837j;
import m2.C0864f;
import m2.C0880v;
import m2.InterfaceC0859a;
import n0.C0921D;
import n0.C0926e;
import n0.C0929h;
import n0.InterfaceC0936o;
import n1.C0944e;
import n2.AbstractC0946A;
import n2.AbstractC0959k;
import n2.AbstractC0962n;
import p0.C1056a;
import p0.C1057b;
import q2.InterfaceC1078i;
import r0.AbstractC1102P;
import r0.AbstractC1105T;
import r0.C1091E;
import r0.C1106U;
import s0.C1190d;
import t0.AbstractC1248f;
import t0.AbstractC1256n;
import t0.C1236E;
import t0.C1237F;
import t0.C1238G;
import t0.C1241J;
import t0.C1261t;

/* renamed from: u0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1314v extends ViewGroup implements t0.f0, t0.l0, n0.v, InterfaceC0456e {

    /* renamed from: F0, reason: collision with root package name */
    public static Class f11158F0;

    /* renamed from: G0, reason: collision with root package name */
    public static Method f11159G0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f11160A;

    /* renamed from: A0, reason: collision with root package name */
    public final C1310t f11161A0;

    /* renamed from: B, reason: collision with root package name */
    public final C0926e f11162B;

    /* renamed from: B0, reason: collision with root package name */
    public final InterfaceC1284f0 f11163B0;

    /* renamed from: C, reason: collision with root package name */
    public final G.z f11164C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f11165C0;

    /* renamed from: D, reason: collision with root package name */
    public y2.c f11166D;

    /* renamed from: D0, reason: collision with root package name */
    public final z0.j f11167D0;
    public final W.a E;

    /* renamed from: E0, reason: collision with root package name */
    public final C1308s f11168E0;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public final C1287h f11169G;

    /* renamed from: H, reason: collision with root package name */
    public final t0.h0 f11170H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f11171I;

    /* renamed from: J, reason: collision with root package name */
    public C1280d0 f11172J;

    /* renamed from: K, reason: collision with root package name */
    public C1309s0 f11173K;

    /* renamed from: L, reason: collision with root package name */
    public O0.a f11174L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f11175M;

    /* renamed from: N, reason: collision with root package name */
    public final t0.Q f11176N;

    /* renamed from: O, reason: collision with root package name */
    public final C1276b0 f11177O;

    /* renamed from: P, reason: collision with root package name */
    public long f11178P;

    /* renamed from: Q, reason: collision with root package name */
    public final int[] f11179Q;

    /* renamed from: R, reason: collision with root package name */
    public final float[] f11180R;

    /* renamed from: S, reason: collision with root package name */
    public final float[] f11181S;

    /* renamed from: T, reason: collision with root package name */
    public final float[] f11182T;

    /* renamed from: U, reason: collision with root package name */
    public long f11183U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f11184V;

    /* renamed from: W, reason: collision with root package name */
    public long f11185W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f11186a0;

    /* renamed from: b0, reason: collision with root package name */
    public final C0274k0 f11187b0;

    /* renamed from: c0, reason: collision with root package name */
    public final J.F f11188c0;

    /* renamed from: d0, reason: collision with root package name */
    public y2.c f11189d0;

    /* renamed from: e0, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1289i f11190e0;

    /* renamed from: f0, reason: collision with root package name */
    public final ViewTreeObserverOnScrollChangedListenerC1291j f11191f0;

    /* renamed from: g0, reason: collision with root package name */
    public final ViewTreeObserverOnTouchModeChangeListenerC1293k f11192g0;

    /* renamed from: h, reason: collision with root package name */
    public long f11193h;
    public final I0.C h0;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f11194i;

    /* renamed from: i0, reason: collision with root package name */
    public final I0.A f11195i0;

    /* renamed from: j, reason: collision with root package name */
    public final C1238G f11196j;

    /* renamed from: j0, reason: collision with root package name */
    public final AtomicReference f11197j0;

    /* renamed from: k, reason: collision with root package name */
    public final C0274k0 f11198k;

    /* renamed from: k0, reason: collision with root package name */
    public final C1300n0 f11199k0;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.compose.ui.focus.b f11200l;

    /* renamed from: l0, reason: collision with root package name */
    public final C1317w0 f11201l0;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC1078i f11202m;

    /* renamed from: m0, reason: collision with root package name */
    public final C0274k0 f11203m0;

    /* renamed from: n, reason: collision with root package name */
    public final ViewOnDragListenerC1307r0 f11204n;

    /* renamed from: n0, reason: collision with root package name */
    public int f11205n0;

    /* renamed from: o, reason: collision with root package name */
    public final c1 f11206o;

    /* renamed from: o0, reason: collision with root package name */
    public final C0274k0 f11207o0;

    /* renamed from: p, reason: collision with root package name */
    public final C0601t f11208p;

    /* renamed from: p0, reason: collision with root package name */
    public final C0772b f11209p0;
    public final C1236E q;
    public final C0782c q0;

    /* renamed from: r, reason: collision with root package name */
    public final C1314v f11210r;

    /* renamed from: r0, reason: collision with root package name */
    public final C1190d f11211r0;

    /* renamed from: s, reason: collision with root package name */
    public final A0.r f11212s;

    /* renamed from: s0, reason: collision with root package name */
    public final V f11213s0;

    /* renamed from: t, reason: collision with root package name */
    public final G f11214t;

    /* renamed from: t0, reason: collision with root package name */
    public MotionEvent f11215t0;

    /* renamed from: u, reason: collision with root package name */
    public X.c f11216u;

    /* renamed from: u0, reason: collision with root package name */
    public long f11217u0;

    /* renamed from: v, reason: collision with root package name */
    public final C1285g f11218v;
    public final K1.l v0;

    /* renamed from: w, reason: collision with root package name */
    public final C0587f f11219w;

    /* renamed from: w0, reason: collision with root package name */
    public final L.d f11220w0;

    /* renamed from: x, reason: collision with root package name */
    public final W.f f11221x;

    /* renamed from: x0, reason: collision with root package name */
    public final B1.E f11222x0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f11223y;

    /* renamed from: y0, reason: collision with root package name */
    public final RunnableC0015e f11224y0;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f11225z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f11226z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v13, types: [u0.i] */
    /* JADX WARN: Type inference failed for: r3v14, types: [u0.j] */
    /* JADX WARN: Type inference failed for: r3v15, types: [u0.k] */
    public C1314v(Context context, InterfaceC1078i interfaceC1078i) {
        super(context);
        int i2 = 0;
        this.f11193h = 9205357640488583168L;
        int i3 = 1;
        this.f11194i = true;
        this.f11196j = new C1238G();
        O0.d d3 = l0.c.d(context);
        J.W w2 = J.W.f4107k;
        this.f11198k = C0257c.N(d3, w2);
        A0.e eVar = new A0.e();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(eVar);
        this.f11200l = new androidx.compose.ui.focus.b(new C1299n(1, this, C1314v.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0, 0), new C1301o(2, 0, C1314v.class, this, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z"), new C1299n(1, this, C1314v.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0, 1), new C0428e(0, this, C1314v.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0, 5), new C0428e(0, this, C1314v.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0, 6), new C1303p(this, C1314v.class, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;", 0));
        ViewOnDragListenerC1307r0 viewOnDragListenerC1307r0 = new ViewOnDragListenerC1307r0();
        this.f11202m = interfaceC1078i;
        this.f11204n = viewOnDragListenerC1307r0;
        this.f11206o = new c1();
        V.o a3 = androidx.compose.ui.input.key.a.a(new r(this, i2));
        V.o a4 = androidx.compose.ui.input.rotary.a.a();
        this.f11208p = new C0601t();
        C1236E c1236e = new C1236E(3, 0, false);
        c1236e.a0(C1106U.f9844b);
        c1236e.X(getDensity());
        c1236e.b0(emptySemanticsElement.k(a4).k(a3).k(((androidx.compose.ui.focus.b) getFocusOwner()).f6749i).k(viewOnDragListenerC1307r0.f11137c));
        this.q = c1236e;
        this.f11210r = this;
        this.f11212s = new A0.r(getRoot(), eVar);
        G g3 = new G(this);
        this.f11214t = g3;
        this.f11216u = new X.c(this, new C0428e(0, this, N.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 4));
        this.f11218v = new C1285g(context);
        this.f11219w = new C0587f(this);
        this.f11221x = new W.f();
        this.f11223y = new ArrayList();
        this.f11162B = new C0926e();
        C1236E root = getRoot();
        G.z zVar = new G.z();
        zVar.f1214b = root;
        zVar.f1215c = new K1.m((C1261t) root.f10378C.f4241c);
        zVar.f1216d = new B.F(27);
        zVar.f1217e = new t0.r();
        this.f11164C = zVar;
        this.f11166D = C1297m.f11108j;
        this.E = new W.a(this, getAutofillTree());
        this.f11169G = new C1287h(context);
        this.f11170H = new t0.h0(new r(this, i3));
        this.f11176N = new t0.Q(getRoot());
        this.f11177O = new C1276b0(ViewConfiguration.get(context));
        this.f11178P = AbstractC0423a.m(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f11179Q = new int[]{0, 0};
        float[] a5 = C0565E.a();
        this.f11180R = a5;
        this.f11181S = C0565E.a();
        this.f11182T = C0565E.a();
        this.f11183U = -1L;
        this.f11185W = 9187343241974906880L;
        this.f11186a0 = true;
        J.W w3 = J.W.f4109m;
        this.f11187b0 = C0257c.N(null, w3);
        this.f11188c0 = C0257c.F(new C1310t(this, i3));
        this.f11190e0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: u0.i
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C1314v.this.J();
            }
        };
        this.f11191f0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: u0.j
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C1314v.this.J();
            }
        };
        this.f11192g0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: u0.k
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z3) {
                C0782c c0782c = C1314v.this.q0;
                int i4 = z3 ? 1 : 2;
                c0782c.getClass();
                c0782c.f8105a.setValue(new C0780a(i4));
            }
        };
        I0.C c3 = new I0.C(getView(), this);
        this.h0 = c3;
        this.f11195i0 = new I0.A(c3);
        this.f11197j0 = new AtomicReference(null);
        this.f11199k0 = new C1300n0(getTextInputService());
        this.f11201l0 = new C1317w0();
        this.f11203m0 = C0257c.N(B1.C.M(context), w2);
        Configuration configuration = context.getResources().getConfiguration();
        int i4 = Build.VERSION.SDK_INT;
        this.f11205n0 = i4 >= 31 ? configuration.fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        O0.k kVar = O0.k.f5148h;
        O0.k kVar2 = layoutDirection != 0 ? layoutDirection != 1 ? null : O0.k.f5149i : kVar;
        this.f11207o0 = C0257c.N(kVar2 != null ? kVar2 : kVar, w3);
        this.f11209p0 = new C0772b(this);
        this.q0 = new C0782c(isInTouchMode() ? 1 : 2);
        this.f11211r0 = new C1190d(this);
        this.f11213s0 = new V(this);
        this.v0 = new K1.l(4);
        this.f11220w0 = new L.d(new y2.a[16]);
        this.f11222x0 = new B1.E(3, this);
        this.f11224y0 = new RunnableC0015e(12, this);
        this.f11161A0 = new C1310t(this, i2);
        this.f11163B0 = i4 < 29 ? new K1.e(a5) : new C1286g0();
        addOnAttachStateChangeListener(this.f11216u);
        setWillNotDraw(false);
        setFocusable(true);
        M.f10923a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        int i5 = AbstractC0542s.f7132a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        setAccessibilityDelegate(g3.f7118b);
        setOnDragListener(viewOnDragListenerC1307r0);
        getRoot().e(this);
        if (i4 >= 29) {
            I.f10905a.a(this);
        }
        this.f11167D0 = i4 >= 31 ? new z0.j() : null;
        this.f11168E0 = new C1308s(this);
    }

    @InterfaceC0859a
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1295l get_viewTreeOwners() {
        return (C1295l) this.f11187b0.getValue();
    }

    public static final boolean h(C1314v c1314v, C0425b c0425b, b0.d dVar) {
        Integer J3;
        if (c1314v.isFocused() || c1314v.hasFocus()) {
            return true;
        }
        return super.requestFocus((c0425b == null || (J3 = AbstractC0427d.J(c0425b.f6453a)) == null) ? 130 : J3.intValue(), dVar != null ? AbstractC0571K.y(dVar) : null);
    }

    public static void i(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof C1314v) {
                ((C1314v) childAt).w();
            } else if (childAt instanceof ViewGroup) {
                i((ViewGroup) childAt);
            }
        }
    }

    public static long j(int i2) {
        long j3;
        long j4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            j3 = 0 << 32;
        } else {
            if (mode != 0) {
                if (mode != 1073741824) {
                    throw new IllegalStateException();
                }
                j4 = size;
                j3 = j4 << 32;
                return j3 | j4;
            }
            j3 = 0 << 32;
            size = Integer.MAX_VALUE;
        }
        j4 = size;
        return j3 | j4;
    }

    public static View l(View view, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (z2.h.a(declaredMethod.invoke(view, null), Integer.valueOf(i2))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View l3 = l(viewGroup.getChildAt(i3), i2);
                    if (l3 != null) {
                        return l3;
                    }
                }
            }
        }
        return null;
    }

    public static void n(C1236E c1236e) {
        c1236e.z();
        L.d v3 = c1236e.v();
        int i2 = v3.f4620j;
        if (i2 > 0) {
            Object[] objArr = v3.f4618h;
            int i3 = 0;
            do {
                n((C1236E) objArr[i3]);
                i3++;
            } while (i3 < i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[LOOP:0: B:20:0x004c->B:35:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[EDGE_INSN: B:36:0x0085->B:39:0x0085 BREAK  A[LOOP:0: B:20:0x004c->B:35:0x0082], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean p(android.view.MotionEvent r6) {
        /*
            float r0 = r6.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r6.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r6.getRawX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r6.getRawY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            if (r0 != 0) goto L85
            int r1 = r6.getPointerCount()
            r4 = r3
        L4c:
            if (r4 >= r1) goto L85
            float r0 = r6.getX(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            float r0 = r6.getY(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L7d
            u0.C0 r0 = u0.C0.f10834a
            boolean r0 = r0.a(r6, r4)
            if (r0 != 0) goto L7d
            goto L7f
        L7d:
            r0 = r2
            goto L80
        L7f:
            r0 = r3
        L80:
            if (r0 != 0) goto L85
            int r4 = r4 + 1
            goto L4c
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C1314v.p(android.view.MotionEvent):boolean");
    }

    private void setDensity(O0.b bVar) {
        this.f11198k.setValue(bVar);
    }

    private void setFontFamilyResolver(H0.d dVar) {
        this.f11203m0.setValue(dVar);
    }

    private void setLayoutDirection(O0.k kVar) {
        this.f11207o0.setValue(kVar);
    }

    private final void set_viewTreeOwners(C1295l c1295l) {
        this.f11187b0.setValue(c1295l);
    }

    public final void A(C1236E c1236e, boolean z3, boolean z4) {
        t0.Q q = this.f11176N;
        if (!z3) {
            q.getClass();
            int d3 = AbstractC0837j.d(c1236e.f10379D.f10466c);
            if (d3 == 0 || d3 == 1 || d3 == 2 || d3 == 3) {
                return;
            }
            if (d3 != 4) {
                throw new J2.r();
            }
            t0.L l3 = c1236e.f10379D;
            if (!z4 && c1236e.E() == l3.f10480r.f10438A && (l3.f10467d || l3.f10468e)) {
                return;
            }
            l3.f10468e = true;
            l3.f10469f = true;
            if (!c1236e.f10384K && l3.f10480r.f10438A) {
                C1236E s3 = c1236e.s();
                if ((s3 == null || !s3.f10379D.f10468e) && (s3 == null || !s3.f10379D.f10467d)) {
                    q.f10500b.e(c1236e, false);
                }
                if (q.f10502d) {
                    return;
                }
                E(null);
                return;
            }
            return;
        }
        q.getClass();
        int d4 = AbstractC0837j.d(c1236e.f10379D.f10466c);
        if (d4 != 0) {
            if (d4 == 1) {
                return;
            }
            if (d4 != 2) {
                if (d4 == 3) {
                    return;
                }
                if (d4 != 4) {
                    throw new J2.r();
                }
            }
        }
        t0.L l4 = c1236e.f10379D;
        if ((l4.f10470g || l4.f10471h) && !z4) {
            return;
        }
        l4.f10471h = true;
        l4.f10472i = true;
        l4.f10468e = true;
        l4.f10469f = true;
        if (c1236e.f10384K) {
            return;
        }
        C1236E s4 = c1236e.s();
        boolean a3 = z2.h.a(c1236e.F(), Boolean.TRUE);
        K1.l lVar = q.f10500b;
        if (a3 && ((s4 == null || !s4.f10379D.f10470g) && (s4 == null || !s4.f10379D.f10471h))) {
            lVar.e(c1236e, true);
        } else if (c1236e.E() && ((s4 == null || !s4.f10379D.f10468e) && (s4 == null || !s4.f10379D.f10467d))) {
            lVar.e(c1236e, false);
        }
        if (q.f10502d) {
            return;
        }
        E(null);
    }

    public final void B() {
        G g3 = this.f11214t;
        g3.f10894y = true;
        if (g3.r() && !g3.f10870J) {
            g3.f10870J = true;
            g3.f10882l.post(g3.f10871K);
        }
        X.c cVar = this.f11216u;
        cVar.f6192o = true;
        if (!cVar.h() || cVar.f6199w) {
            return;
        }
        cVar.f6199w = true;
        cVar.f6194r.post(cVar.f6200x);
    }

    public final void C() {
        if (this.f11184V) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.f11183U) {
            this.f11183U = currentAnimationTimeMillis;
            InterfaceC1284f0 interfaceC1284f0 = this.f11163B0;
            float[] fArr = this.f11181S;
            interfaceC1284f0.b(this, fArr);
            N.t(fArr, this.f11182T);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f11179Q;
            view.getLocationOnScreen(iArr);
            float f3 = iArr[0];
            float f4 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f11185W = K1.f.e(f3 - iArr[0], f4 - iArr[1]);
        }
    }

    public final void D(t0.e0 e0Var) {
        K1.l lVar;
        Reference poll;
        L.d dVar;
        if (this.f11173K != null) {
            R0.t tVar = X0.f10987w;
        }
        do {
            lVar = this.v0;
            poll = ((ReferenceQueue) lVar.f4557c).poll();
            dVar = (L.d) lVar.f4556b;
            if (poll != null) {
                dVar.m(poll);
            }
        } while (poll != null);
        dVar.b(new WeakReference(e0Var, (ReferenceQueue) lVar.f4557c));
    }

    public final void E(C1236E c1236e) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (c1236e != null) {
            while (c1236e != null && c1236e.f10379D.f10480r.f10455r == 1) {
                if (!this.f11175M) {
                    C1236E s3 = c1236e.s();
                    if (s3 == null) {
                        break;
                    }
                    long j3 = ((C1261t) s3.f10378C.f4241c).f9837k;
                    if (O0.a.f(j3) && O0.a.e(j3)) {
                        break;
                    }
                }
                c1236e = c1236e.s();
            }
            if (c1236e == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long F(long j3) {
        C();
        float d3 = b0.c.d(j3) - b0.c.d(this.f11185W);
        float e3 = b0.c.e(j3) - b0.c.e(this.f11185W);
        return C0565E.b(K1.f.e(d3, e3), this.f11182T);
    }

    public final int G(MotionEvent motionEvent) {
        Object obj;
        int i2 = 0;
        if (this.f11165C0) {
            this.f11165C0 = false;
            int metaState = motionEvent.getMetaState();
            this.f11206o.getClass();
            c1.f11037b.setValue(new n0.u(metaState));
        }
        C0926e c0926e = this.f11162B;
        K1.c a3 = c0926e.a(motionEvent, this);
        G.z zVar = this.f11164C;
        if (a3 != null) {
            List list = (List) a3.f4532a;
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i3 = size - 1;
                    obj = list.get(size);
                    if (((n0.t) obj).f8977e) {
                        break;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            obj = null;
            n0.t tVar = (n0.t) obj;
            if (tVar != null) {
                this.f11193h = tVar.f8976d;
            }
            i2 = zVar.a(a3, this, q(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && (i2 & 1) == 0) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                c0926e.f8929c.delete(pointerId);
                c0926e.f8928b.delete(pointerId);
            }
        } else {
            zVar.b();
        }
        return i2;
    }

    public final void H(MotionEvent motionEvent, int i2, long j3, boolean z3) {
        int actionMasked = motionEvent.getActionMasked();
        int i3 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i3 = motionEvent.getActionIndex();
            }
        } else if (i2 != 9 && i2 != 10) {
            i3 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i3 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerPropertiesArr[i4] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i5 = 0; i5 < pointerCount; i5++) {
            pointerCoordsArr[i5] = new MotionEvent.PointerCoords();
        }
        int i6 = 0;
        while (i6 < pointerCount) {
            int i7 = ((i3 < 0 || i6 < i3) ? 0 : 1) + i6;
            motionEvent.getPointerProperties(i7, pointerPropertiesArr[i6]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i6];
            motionEvent.getPointerCoords(i7, pointerCoords);
            long s3 = s(K1.f.e(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = b0.c.d(s3);
            pointerCoords.y = b0.c.e(s3);
            i6++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j3 : motionEvent.getDownTime(), j3, i2, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z3 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        K1.c a3 = this.f11162B.a(obtain, this);
        z2.h.c(a3);
        this.f11164C.a(a3, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(y2.e r6, q2.InterfaceC1073d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof u0.C1312u
            if (r0 == 0) goto L13
            r0 = r7
            u0.u r0 = (u0.C1312u) r0
            int r1 = r0.f11155m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11155m = r1
            goto L18
        L13:
            u0.u r0 = new u0.u
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f11153k
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f11155m
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            C1.y.J(r7)
            goto L49
        L2f:
            C1.y.J(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.f11197j0
            u0.r r2 = new u0.r
            r4 = 2
            r2.<init>(r5, r4)
            r0.f11155m = r3
            V.r r3 = new V.r
            r4 = 0
            r3.<init>(r2, r7, r6, r4)
            java.lang.Object r6 = J2.B.e(r3, r0)
            if (r6 != r1) goto L49
            return
        L49:
            J2.r r6 = new J2.r
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C1314v.I(y2.e, q2.d):void");
    }

    public final void J() {
        int[] iArr = this.f11179Q;
        getLocationOnScreen(iArr);
        long j3 = this.f11178P;
        int i2 = (int) (j3 >> 32);
        int i3 = (int) (j3 & 4294967295L);
        boolean z3 = false;
        int i4 = iArr[0];
        if (i2 != i4 || i3 != iArr[1]) {
            this.f11178P = AbstractC0423a.m(i4, iArr[1]);
            if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
                getRoot().f10379D.f10480r.z0();
                z3 = true;
            }
        }
        this.f11176N.a(z3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        W.a aVar = this.E;
        if (aVar != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = sparseArray.keyAt(i2);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
                W.d dVar = W.d.f5887a;
                if (dVar.d(autofillValue)) {
                    dVar.i(autofillValue).toString();
                    B1.t.w(aVar.f5884b.f5889a.get(Integer.valueOf(keyAt)));
                } else {
                    if (dVar.b(autofillValue)) {
                        throw new C0864f("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (dVar.c(autofillValue)) {
                        throw new C0864f("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (dVar.e(autofillValue)) {
                        throw new C0864f("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0456e
    public final void b(InterfaceC0470t interfaceC0470t) {
        setShowLayoutBounds(C1317w0.a());
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        return this.f11214t.f(false, i2, this.f11193h);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i2) {
        return this.f11214t.f(true, i2, this.f11193h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z3;
        if (!isAttachedToWindow()) {
            n(getRoot());
        }
        t(true);
        synchronized (T.n.f5710b) {
            C0736B c0736b = ((C0374b) T.n.f5717i.get()).f5673h;
            if (c0736b != null) {
                z3 = c0736b.h();
            }
        }
        if (z3) {
            T.n.a();
        }
        this.f11160A = true;
        C0601t c0601t = this.f11208p;
        C0584c c0584c = c0601t.f7270a;
        Canvas canvas2 = c0584c.f7245a;
        c0584c.f7245a = canvas;
        getRoot().j(c0584c, null);
        c0601t.f7270a.f7245a = canvas2;
        if (true ^ this.f11223y.isEmpty()) {
            int size = this.f11223y.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((t0.e0) this.f11223y.get(i2)).f();
            }
        }
        if (X0.f10986A) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.f11223y.clear();
        this.f11160A = false;
        ArrayList arrayList = this.f11225z;
        if (arrayList != null) {
            this.f11223y.addAll(arrayList);
            arrayList.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        C1056a c1056a;
        int size;
        C0292u c0292u;
        V.n nVar;
        C0292u c0292u2;
        if (this.f11226z0) {
            RunnableC0015e runnableC0015e = this.f11224y0;
            removeCallbacks(runnableC0015e);
            if (motionEvent.getActionMasked() == 8) {
                this.f11226z0 = false;
            } else {
                runnableC0015e.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (p(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.isFromSource(4194304)) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            float f3 = -motionEvent.getAxisValue(26);
            getContext();
            float b3 = AbstractC0543t.b(viewConfiguration) * f3;
            getContext();
            C1057b c1057b = new C1057b(b3, AbstractC0543t.a(viewConfiguration) * f3, motionEvent.getDeviceId(), motionEvent.getEventTime());
            androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) getFocusOwner();
            if (!(!bVar.f6747g.a())) {
                throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.".toString());
            }
            C0442s g3 = AbstractC0427d.g(bVar.f6746f);
            if (g3 != null) {
                V.n nVar2 = g3.f5858h;
                if (!nVar2.f5869t) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                C1236E v3 = AbstractC1248f.v(g3);
                loop0: while (true) {
                    if (v3 == null) {
                        nVar = null;
                        break;
                    }
                    if ((((V.n) v3.f10378C.f4244f).f5861k & 16384) != 0) {
                        while (nVar2 != null) {
                            if ((nVar2.f5860j & 16384) != 0) {
                                L.d dVar = null;
                                nVar = nVar2;
                                while (nVar != null) {
                                    if (nVar instanceof C1056a) {
                                        break loop0;
                                    }
                                    if ((nVar.f5860j & 16384) != 0 && (nVar instanceof AbstractC1256n)) {
                                        int i2 = 0;
                                        for (V.n nVar3 = ((AbstractC1256n) nVar).f10608v; nVar3 != null; nVar3 = nVar3.f5863m) {
                                            if ((nVar3.f5860j & 16384) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    nVar = nVar3;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new L.d(new V.n[16]);
                                                    }
                                                    if (nVar != null) {
                                                        dVar.b(nVar);
                                                        nVar = null;
                                                    }
                                                    dVar.b(nVar3);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    nVar = AbstractC1248f.f(dVar);
                                }
                            }
                            nVar2 = nVar2.f5862l;
                        }
                    }
                    v3 = v3.s();
                    nVar2 = (v3 == null || (c0292u2 = v3.f10378C) == null) ? null : (t0.n0) c0292u2.f4243e;
                }
                c1056a = (C1056a) nVar;
            } else {
                c1056a = null;
            }
            if (c1056a == null) {
                return false;
            }
            C1056a c1056a2 = c1056a;
            V.n nVar4 = c1056a2.f5858h;
            if (!nVar4.f5869t) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            V.n nVar5 = nVar4.f5862l;
            C1236E v4 = AbstractC1248f.v(c1056a);
            ArrayList arrayList = null;
            while (v4 != null) {
                if ((((V.n) v4.f10378C.f4244f).f5861k & 16384) != 0) {
                    while (nVar5 != null) {
                        if ((nVar5.f5860j & 16384) != 0) {
                            V.n nVar6 = nVar5;
                            L.d dVar2 = null;
                            while (nVar6 != null) {
                                if (nVar6 instanceof C1056a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nVar6);
                                } else if ((nVar6.f5860j & 16384) != 0 && (nVar6 instanceof AbstractC1256n)) {
                                    int i3 = 0;
                                    for (V.n nVar7 = ((AbstractC1256n) nVar6).f10608v; nVar7 != null; nVar7 = nVar7.f5863m) {
                                        if ((nVar7.f5860j & 16384) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                nVar6 = nVar7;
                                            } else {
                                                if (dVar2 == null) {
                                                    dVar2 = new L.d(new V.n[16]);
                                                }
                                                if (nVar6 != null) {
                                                    dVar2.b(nVar6);
                                                    nVar6 = null;
                                                }
                                                dVar2.b(nVar7);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                nVar6 = AbstractC1248f.f(dVar2);
                            }
                        }
                        nVar5 = nVar5.f5862l;
                    }
                }
                v4 = v4.s();
                nVar5 = (v4 == null || (c0292u = v4.f10378C) == null) ? null : (t0.n0) c0292u.f4243e;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i4 = size - 1;
                    y2.c cVar = ((C1056a) arrayList.get(size)).f9726v;
                    if (cVar != null && ((Boolean) cVar.l(c1057b)).booleanValue()) {
                        break;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    size = i4;
                }
            }
            V.n nVar8 = c1056a2.f5858h;
            L.d dVar3 = null;
            while (true) {
                if (nVar8 != null) {
                    if (nVar8 instanceof C1056a) {
                        y2.c cVar2 = ((C1056a) nVar8).f9726v;
                        if (cVar2 != null && ((Boolean) cVar2.l(c1057b)).booleanValue()) {
                            break;
                        }
                    } else if ((nVar8.f5860j & 16384) != 0 && (nVar8 instanceof AbstractC1256n)) {
                        int i5 = 0;
                        for (V.n nVar9 = ((AbstractC1256n) nVar8).f10608v; nVar9 != null; nVar9 = nVar9.f5863m) {
                            if ((nVar9.f5860j & 16384) != 0) {
                                i5++;
                                if (i5 == 1) {
                                    nVar8 = nVar9;
                                } else {
                                    if (dVar3 == null) {
                                        dVar3 = new L.d(new V.n[16]);
                                    }
                                    if (nVar8 != null) {
                                        dVar3.b(nVar8);
                                        nVar8 = null;
                                    }
                                    dVar3.b(nVar9);
                                }
                            }
                        }
                        if (i5 == 1) {
                        }
                    }
                    nVar8 = AbstractC1248f.f(dVar3);
                } else {
                    V.n nVar10 = c1056a2.f5858h;
                    L.d dVar4 = null;
                    while (true) {
                        if (nVar10 == null) {
                            if (arrayList == null) {
                                return false;
                            }
                            int size2 = arrayList.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                y2.c cVar3 = ((C1056a) arrayList.get(i6)).f9725u;
                                if (cVar3 == null || !((Boolean) cVar3.l(c1057b)).booleanValue()) {
                                }
                            }
                            return false;
                        }
                        if (nVar10 instanceof C1056a) {
                            y2.c cVar4 = ((C1056a) nVar10).f9725u;
                            if (cVar4 != null && ((Boolean) cVar4.l(c1057b)).booleanValue()) {
                                break;
                            }
                        } else if ((nVar10.f5860j & 16384) != 0 && (nVar10 instanceof AbstractC1256n)) {
                            int i7 = 0;
                            for (V.n nVar11 = ((AbstractC1256n) nVar10).f10608v; nVar11 != null; nVar11 = nVar11.f5863m) {
                                if ((nVar11.f5860j & 16384) != 0) {
                                    i7++;
                                    if (i7 == 1) {
                                        nVar10 = nVar11;
                                    } else {
                                        if (dVar4 == null) {
                                            dVar4 = new L.d(new V.n[16]);
                                        }
                                        if (nVar10 != null) {
                                            dVar4.b(nVar10);
                                            nVar10 = null;
                                        }
                                        dVar4.b(nVar11);
                                    }
                                }
                            }
                            if (i7 == 1) {
                            }
                        }
                        nVar10 = AbstractC1248f.f(dVar4);
                    }
                }
            }
        } else if ((m(motionEvent) & 1) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C1314v.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((androidx.compose.ui.focus.b) getFocusOwner()).b(keyEvent, new D.c0(this, 15, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f11206o.getClass();
        c1.f11037b.setValue(new n0.u(metaState));
        return ((androidx.compose.ui.focus.b) getFocusOwner()).b(keyEvent, C0430g.f6462j) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C0292u c0292u;
        if (isFocused()) {
            androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) getFocusOwner();
            if (!(!bVar.f6747g.a())) {
                throw new IllegalStateException("Dispatching intercepted soft keyboard event while focus system is invalidated.".toString());
            }
            C0442s g3 = AbstractC0427d.g(bVar.f6746f);
            if (g3 != null) {
                V.n nVar = g3.f5858h;
                if (!nVar.f5869t) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                C1236E v3 = AbstractC1248f.v(g3);
                while (v3 != null) {
                    if ((((V.n) v3.f10378C.f4244f).f5861k & 131072) != 0) {
                        while (nVar != null) {
                            if ((nVar.f5860j & 131072) != 0) {
                                V.n nVar2 = nVar;
                                L.d dVar = null;
                                while (nVar2 != null) {
                                    if ((nVar2.f5860j & 131072) != 0 && (nVar2 instanceof AbstractC1256n)) {
                                        int i2 = 0;
                                        for (V.n nVar3 = ((AbstractC1256n) nVar2).f10608v; nVar3 != null; nVar3 = nVar3.f5863m) {
                                            if ((nVar3.f5860j & 131072) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    nVar2 = nVar3;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new L.d(new V.n[16]);
                                                    }
                                                    if (nVar2 != null) {
                                                        dVar.b(nVar2);
                                                        nVar2 = null;
                                                    }
                                                    dVar.b(nVar3);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    nVar2 = AbstractC1248f.f(dVar);
                                }
                            }
                            nVar = nVar.f5862l;
                        }
                    }
                    v3 = v3.s();
                    nVar = (v3 == null || (c0292u = v3.f10378C) == null) ? null : (t0.n0) c0292u.f4243e;
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            H.f10897a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f11226z0) {
            RunnableC0015e runnableC0015e = this.f11224y0;
            removeCallbacks(runnableC0015e);
            MotionEvent motionEvent2 = this.f11215t0;
            z2.h.c(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f11226z0 = false;
            } else {
                runnableC0015e.run();
            }
        }
        if (p(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !r(motionEvent)) {
            return false;
        }
        int m3 = m(motionEvent);
        if ((m3 & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (m3 & 1) != 0;
    }

    public final View findViewByAccessibilityIdTraversal(int i2) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i2));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = l(this, i2);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i2) {
        if (view != null) {
            b0.d d3 = AbstractC0427d.d(view);
            C0425b K3 = AbstractC0427d.K(i2);
            if (z2.h.a(((androidx.compose.ui.focus.b) getFocusOwner()).c(K3 != null ? K3.f6453a : 6, d3, C1297m.f11109k), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(view, i2);
    }

    public final C1280d0 getAndroidViewsHandler$ui_release() {
        if (this.f11172J == null) {
            C1280d0 c1280d0 = new C1280d0(getContext());
            this.f11172J = c1280d0;
            addView(c1280d0, -1);
            requestLayout();
        }
        C1280d0 c1280d02 = this.f11172J;
        z2.h.c(c1280d02);
        return c1280d02;
    }

    public W.b getAutofill() {
        return this.E;
    }

    public W.f getAutofillTree() {
        return this.f11221x;
    }

    public final y2.c getConfigurationChangeObserver() {
        return this.f11166D;
    }

    public final X.c getContentCaptureManager$ui_release() {
        return this.f11216u;
    }

    public InterfaceC1078i getCoroutineContext() {
        return this.f11202m;
    }

    public O0.b getDensity() {
        return (O0.b) this.f11198k.getValue();
    }

    public Y.a getDragAndDropManager() {
        return this.f11204n;
    }

    public InterfaceC0431h getFocusOwner() {
        return this.f11200l;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C0880v c0880v;
        b0.d x2 = x();
        if (x2 != null) {
            rect.left = Math.round(x2.f7060a);
            rect.top = Math.round(x2.f7061b);
            rect.right = Math.round(x2.f7062c);
            rect.bottom = Math.round(x2.f7063d);
            c0880v = C0880v.f8657a;
        } else {
            c0880v = null;
        }
        if (c0880v == null) {
            super.getFocusedRect(rect);
        }
    }

    public H0.d getFontFamilyResolver() {
        return (H0.d) this.f11203m0.getValue();
    }

    public H0.c getFontLoader() {
        return this.f11201l0;
    }

    public InterfaceC0561A getGraphicsContext() {
        return this.f11219w;
    }

    public InterfaceC0771a getHapticFeedBack() {
        return this.f11209p0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f11176N.f10500b.g();
    }

    public InterfaceC0781b getInputModeManager() {
        return this.q0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f11183U;
    }

    @Override // android.view.View, android.view.ViewParent
    public O0.k getLayoutDirection() {
        return (O0.k) this.f11207o0.getValue();
    }

    public long getMeasureIteration() {
        t0.Q q = this.f11176N;
        if (q.f10501c) {
            return q.f10505g;
        }
        AbstractC0946A.q("measureIteration should be only used during the measure/layout pass");
        throw null;
    }

    public C1190d getModifierLocalManager() {
        return this.f11211r0;
    }

    public AbstractC1102P getPlacementScope() {
        int i2 = AbstractC1105T.f9843b;
        return new C1091E(1, this);
    }

    public InterfaceC0936o getPointerIconService() {
        return this.f11168E0;
    }

    public C1236E getRoot() {
        return this.q;
    }

    public t0.l0 getRootForTest() {
        return this.f11210r;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        z0.j jVar;
        if (Build.VERSION.SDK_INT < 31 || (jVar = this.f11167D0) == null) {
            return false;
        }
        return ((Boolean) jVar.f11883a.getValue()).booleanValue();
    }

    public A0.r getSemanticsOwner() {
        return this.f11212s;
    }

    public C1238G getSharedDrawScope() {
        return this.f11196j;
    }

    public boolean getShowLayoutBounds() {
        return this.f11171I;
    }

    public t0.h0 getSnapshotObserver() {
        return this.f11170H;
    }

    public R0 getSoftwareKeyboardController() {
        return this.f11199k0;
    }

    public I0.A getTextInputService() {
        return this.f11195i0;
    }

    public S0 getTextToolbar() {
        return this.f11213s0;
    }

    public View getView() {
        return this;
    }

    public V0 getViewConfiguration() {
        return this.f11177O;
    }

    public final C1295l getViewTreeOwners() {
        return (C1295l) this.f11188c0.getValue();
    }

    public b1 getWindowInfo() {
        return this.f11206o;
    }

    public final t0.e0 k(C0018a c0018a, C0944e c0944e, C0663b c0663b) {
        Reference poll;
        L.d dVar;
        Object obj;
        if (c0663b != null) {
            return new C1315v0(c0663b, null, this, c0018a, c0944e);
        }
        do {
            K1.l lVar = this.v0;
            poll = ((ReferenceQueue) lVar.f4557c).poll();
            dVar = (L.d) lVar.f4556b;
            if (poll != null) {
                dVar.m(poll);
            }
        } while (poll != null);
        while (true) {
            if (!dVar.l()) {
                obj = null;
                break;
            }
            obj = ((Reference) dVar.n(dVar.f4620j - 1)).get();
            if (obj != null) {
                break;
            }
        }
        t0.e0 e0Var = (t0.e0) obj;
        if (e0Var != null) {
            e0Var.l(c0018a, c0944e);
            return e0Var;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT != 28) {
            return new C1315v0(getGraphicsContext().b(), getGraphicsContext(), this, c0018a, c0944e);
        }
        if (isHardwareAccelerated() && this.f11186a0) {
            try {
                return new L0(this, c0018a, c0944e);
            } catch (Throwable unused) {
                this.f11186a0 = false;
            }
        }
        if (this.f11173K == null) {
            if (!X0.f10990z) {
                N.D(new View(getContext()));
            }
            C1309s0 c1309s0 = X0.f10986A ? new C1309s0(getContext()) : new Y0(getContext());
            this.f11173K = c1309s0;
            addView(c1309s0, -1);
        }
        C1309s0 c1309s02 = this.f11173K;
        z2.h.c(c1309s02);
        return new X0(this, c1309s02, c0018a, c0944e);
    }

    public final int m(MotionEvent motionEvent) {
        int i2;
        int actionMasked;
        float[] fArr = this.f11181S;
        removeCallbacks(this.f11222x0);
        try {
            this.f11183U = AnimationUtils.currentAnimationTimeMillis();
            this.f11163B0.b(this, fArr);
            N.t(fArr, this.f11182T);
            long b3 = C0565E.b(K1.f.e(motionEvent.getX(), motionEvent.getY()), fArr);
            this.f11185W = K1.f.e(motionEvent.getRawX() - b0.c.d(b3), motionEvent.getRawY() - b0.c.e(b3));
            boolean z3 = true;
            this.f11184V = true;
            t(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f11215t0;
                boolean z4 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                G.z zVar = this.f11164C;
                if (motionEvent2 != null && (motionEvent2.getSource() != motionEvent.getSource() || motionEvent2.getToolType(0) != motionEvent.getToolType(0))) {
                    if (motionEvent2.getButtonState() == 0 && (actionMasked = motionEvent2.getActionMasked()) != 0 && actionMasked != 2 && actionMasked != 6) {
                        if (motionEvent2.getActionMasked() != 10 && z4) {
                            H(motionEvent2, 10, motionEvent2.getEventTime(), true);
                        }
                    }
                    zVar.b();
                }
                boolean z5 = motionEvent.getToolType(0) == 3;
                if (z4 || !z5 || actionMasked2 == 3 || actionMasked2 == 9 || !q(motionEvent)) {
                    i2 = 9;
                } else {
                    i2 = 9;
                    H(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = this.f11215t0;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = this.f11215t0;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    C0926e c0926e = this.f11162B;
                    if (action == i2 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            c0926e.f8929c.delete(pointerId);
                            c0926e.f8928b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.f11215t0;
                        float x2 = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = this.f11215t0;
                        boolean z6 = (x2 == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = this.f11215t0;
                        if ((motionEvent7 != null ? motionEvent7.getEventTime() : -1L) == motionEvent.getEventTime()) {
                            z3 = false;
                        }
                        if (z6 || z3) {
                            if (pointerId >= 0) {
                                c0926e.f8929c.delete(pointerId);
                                c0926e.f8928b.delete(pointerId);
                            }
                            ((C0929h) ((K1.m) zVar.f1215c).f4559b).f8942a.g();
                        }
                    }
                }
                this.f11215t0 = MotionEvent.obtainNoHistory(motionEvent);
                return G(motionEvent);
            } finally {
                Trace.endSection();
            }
        } finally {
            this.f11184V = false;
        }
    }

    public final void o(C1236E c1236e) {
        int i2 = 0;
        this.f11176N.p(c1236e, false);
        L.d v3 = c1236e.v();
        int i3 = v3.f4620j;
        if (i3 > 0) {
            Object[] objArr = v3.f4618h;
            do {
                o((C1236E) objArr[i2]);
                i2++;
            } while (i2 < i3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC0470t interfaceC0470t;
        C0472v e3;
        InterfaceC0470t interfaceC0470t2;
        InterfaceC0470t interfaceC0470t3;
        super.onAttachedToWindow();
        this.f11206o.f11038a.setValue(Boolean.valueOf(hasWindowFocus()));
        o(getRoot());
        n(getRoot());
        getSnapshotObserver().f10585a.d();
        W.a aVar = this.E;
        if (aVar != null) {
            W.e.f5888a.a(aVar);
        }
        InterfaceC0470t g3 = androidx.lifecycle.Q.g(this);
        u1.f h2 = AbstractC0962n.h(this);
        C1295l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (g3 != null && h2 != null && (g3 != (interfaceC0470t3 = viewTreeOwners.f11080a) || h2 != interfaceC0470t3))) {
            if (g3 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (h2 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (interfaceC0470t = viewTreeOwners.f11080a) != null && (e3 = interfaceC0470t.e()) != null) {
                e3.f(this);
            }
            g3.e().a(this);
            C1295l c1295l = new C1295l(g3, h2);
            set_viewTreeOwners(c1295l);
            y2.c cVar = this.f11189d0;
            if (cVar != null) {
                cVar.l(c1295l);
            }
            this.f11189d0 = null;
        }
        int i2 = isInTouchMode() ? 1 : 2;
        C0782c c0782c = this.q0;
        c0782c.getClass();
        c0782c.f8105a.setValue(new C0780a(i2));
        C1295l viewTreeOwners2 = getViewTreeOwners();
        C0472v e4 = (viewTreeOwners2 == null || (interfaceC0470t2 = viewTreeOwners2.f11080a) == null) ? null : interfaceC0470t2.e();
        if (e4 == null) {
            AbstractC0946A.s("No lifecycle owner exists");
            throw null;
        }
        e4.a(this);
        e4.a(this.f11216u);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f11190e0);
        getViewTreeObserver().addOnScrollChangedListener(this.f11191f0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f11192g0);
        if (Build.VERSION.SDK_INT >= 31) {
            K.f10908a.b(this);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        V.q qVar = (V.q) this.f11197j0.get();
        U u3 = (U) (qVar != null ? qVar.f5872b : null);
        if (u3 == null) {
            return this.h0.f3848d;
        }
        V.q qVar2 = (V.q) u3.f10980k.get();
        C1319x0 c1319x0 = (C1319x0) (qVar2 != null ? qVar2.f5872b : null);
        return c1319x0 != null && (c1319x0.f11254e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(l0.c.d(getContext()));
        int i2 = Build.VERSION.SDK_INT;
        if ((i2 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f11205n0) {
            this.f11205n0 = i2 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(B1.C.M(getContext()));
        }
        this.f11166D.l(configuration);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r7 != false) goto L14;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r15) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C1314v.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        X.c cVar = this.f11216u;
        cVar.getClass();
        X.a.f6179a.b(cVar, jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC0470t interfaceC0470t;
        super.onDetachedFromWindow();
        T.w wVar = getSnapshotObserver().f10585a;
        C1.q qVar = wVar.f5752g;
        if (qVar != null) {
            qVar.b();
        }
        wVar.b();
        C1295l viewTreeOwners = getViewTreeOwners();
        C0472v e3 = (viewTreeOwners == null || (interfaceC0470t = viewTreeOwners.f11080a) == null) ? null : interfaceC0470t.e();
        if (e3 == null) {
            AbstractC0946A.s("No lifecycle owner exists");
            throw null;
        }
        e3.f(this.f11216u);
        e3.f(this);
        W.a aVar = this.E;
        if (aVar != null) {
            W.e.f5888a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f11190e0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f11191f0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f11192g0);
        if (Build.VERSION.SDK_INT >= 31) {
            K.f10908a.a(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z3, int i2, Rect rect) {
        super.onFocusChanged(z3, i2, rect);
        if (z3 || hasFocus()) {
            return;
        }
        androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) getFocusOwner();
        D.S s3 = bVar.f6748h;
        boolean z4 = s3.f762b;
        C0442s c0442s = bVar.f6746f;
        if (z4) {
            AbstractC0427d.e(c0442s, true, true);
            return;
        }
        try {
            s3.f762b = true;
            AbstractC0427d.e(c0442s, true, true);
        } finally {
            D.S.b(s3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i2, int i3, int i4, int i5) {
        this.f11176N.j(this.f11161A0);
        this.f11174L = null;
        J();
        if (this.f11172J != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        t0.Q q = this.f11176N;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                o(getRoot());
            }
            long j3 = j(i2);
            long j4 = j(i3);
            long b3 = B1.C.b((int) (j3 >>> 32), (int) (j3 & 4294967295L), (int) (j4 >>> 32), (int) (4294967295L & j4));
            O0.a aVar = this.f11174L;
            if (aVar == null) {
                this.f11174L = new O0.a(b3);
                this.f11175M = false;
            } else if (!O0.a.b(aVar.f5132a, b3)) {
                this.f11175M = true;
            }
            q.q(b3);
            q.l();
            setMeasuredDimension(getRoot().f10379D.f10480r.f9834h, getRoot().f10379D.f10480r.f9835i);
            if (this.f11172J != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f10379D.f10480r.f9834h, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f10379D.f10480r.f9835i, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        W.a aVar;
        if (viewStructure == null || (aVar = this.E) == null) {
            return;
        }
        W.c cVar = W.c.f5886a;
        W.f fVar = aVar.f5884b;
        int a3 = cVar.a(viewStructure, fVar.f5889a.size());
        for (Map.Entry entry : fVar.f5889a.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            B1.t.w(entry.getValue());
            ViewStructure b3 = cVar.b(viewStructure, a3);
            if (b3 != null) {
                W.d dVar = W.d.f5887a;
                AutofillId a4 = dVar.a(viewStructure);
                z2.h.c(a4);
                dVar.g(b3, a4, intValue);
                cVar.d(b3, intValue, aVar.f5883a.getContext().getPackageName(), null, null);
                dVar.h(b3, 1);
                throw null;
            }
            a3++;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        if (this.f11194i) {
            O0.k kVar = O0.k.f5148h;
            O0.k kVar2 = i2 != 0 ? i2 != 1 ? null : O0.k.f5149i : kVar;
            if (kVar2 != null) {
                kVar = kVar2;
            }
            setLayoutDirection(kVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        z0.j jVar;
        if (Build.VERSION.SDK_INT < 31 || (jVar = this.f11167D0) == null) {
            return;
        }
        jVar.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        X.c cVar = this.f11216u;
        cVar.getClass();
        X.a.f6179a.c(cVar, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        boolean a3;
        this.f11206o.f11038a.setValue(Boolean.valueOf(z3));
        this.f11165C0 = true;
        super.onWindowFocusChanged(z3);
        if (!z3 || getShowLayoutBounds() == (a3 = C1317w0.a())) {
            return;
        }
        setShowLayoutBounds(a3);
        n(getRoot());
    }

    public final boolean q(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y3 = motionEvent.getY();
        return 0.0f <= x2 && x2 <= ((float) getWidth()) && 0.0f <= y3 && y3 <= ((float) getHeight());
    }

    public final boolean r(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f11215t0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int ordinal = ((androidx.compose.ui.focus.b) getFocusOwner()).f6746f.L0().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return super.requestFocus(i2, rect);
        }
        if (ordinal != 3) {
            throw new J2.r();
        }
        if (isInTouchMode()) {
            return false;
        }
        C0425b K3 = AbstractC0427d.K(i2);
        int i3 = K3 != null ? K3.f6453a : 7;
        Boolean c3 = ((androidx.compose.ui.focus.b) getFocusOwner()).c(i3, rect != null ? new b0.d(rect.left, rect.top, rect.right, rect.bottom) : null, new C0136k1(i3, 4));
        if (c3 != null) {
            return c3.booleanValue();
        }
        return false;
    }

    public final long s(long j3) {
        C();
        long b3 = C0565E.b(j3, this.f11181S);
        return K1.f.e(b0.c.d(this.f11185W) + b0.c.d(b3), b0.c.e(this.f11185W) + b0.c.e(b3));
    }

    public void setAccessibilityEventBatchIntervalMillis(long j3) {
        this.f11214t.f10878h = j3;
    }

    public final void setConfigurationChangeObserver(y2.c cVar) {
        this.f11166D = cVar;
    }

    public final void setContentCaptureManager$ui_release(X.c cVar) {
        this.f11216u = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [V.n] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [V.n] */
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
    public void setCoroutineContext(InterfaceC1078i interfaceC1078i) {
        int i2;
        int i3;
        this.f11202m = interfaceC1078i;
        V.n nVar = (V.n) getRoot().f10378C.f4244f;
        if (nVar instanceof C0921D) {
            ((C0921D) nVar).M0();
        }
        V.n nVar2 = nVar.f5858h;
        if (!nVar2.f5869t) {
            AbstractC0946A.r("visitSubtree called on an unattached node");
            throw null;
        }
        V.n nVar3 = nVar2.f5863m;
        C1236E v3 = AbstractC1248f.v(nVar);
        int[] iArr = new int[16];
        L.d[] dVarArr = new L.d[16];
        int i4 = 0;
        while (v3 != null) {
            if (nVar3 == null) {
                nVar3 = (V.n) v3.f10378C.f4244f;
            }
            if ((nVar3.f5861k & 16) != 0) {
                while (nVar3 != null) {
                    if ((nVar3.f5860j & 16) != 0) {
                        AbstractC1256n abstractC1256n = nVar3;
                        ?? r9 = 0;
                        while (abstractC1256n != 0) {
                            if (abstractC1256n instanceof t0.k0) {
                                t0.k0 k0Var = (t0.k0) abstractC1256n;
                                if (k0Var instanceof C0921D) {
                                    ((C0921D) k0Var).M0();
                                }
                            } else if ((abstractC1256n.f5860j & 16) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                                V.n nVar4 = abstractC1256n.f10608v;
                                int i5 = 0;
                                abstractC1256n = abstractC1256n;
                                r9 = r9;
                                while (nVar4 != null) {
                                    if ((nVar4.f5860j & 16) != 0) {
                                        i5++;
                                        r9 = r9;
                                        if (i5 == 1) {
                                            abstractC1256n = nVar4;
                                        } else {
                                            if (r9 == 0) {
                                                r9 = new L.d(new V.n[16]);
                                            }
                                            if (abstractC1256n != 0) {
                                                r9.b(abstractC1256n);
                                                abstractC1256n = 0;
                                            }
                                            r9.b(nVar4);
                                        }
                                    }
                                    nVar4 = nVar4.f5863m;
                                    abstractC1256n = abstractC1256n;
                                    r9 = r9;
                                }
                                if (i5 == 1) {
                                }
                            }
                            abstractC1256n = AbstractC1248f.f(r9);
                        }
                    }
                    nVar3 = nVar3.f5863m;
                }
            }
            L.d v4 = v3.v();
            if (!v4.k()) {
                if (i4 >= iArr.length) {
                    iArr = Arrays.copyOf(iArr, iArr.length * 2);
                    z2.h.e(iArr, "copyOf(this, newSize)");
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    z2.h.e(copyOf, "copyOf(this, newSize)");
                    dVarArr = (L.d[]) copyOf;
                }
                iArr[i4] = v4.f4620j - 1;
                dVarArr[i4] = v4;
                i4++;
            }
            if (i4 <= 0 || (i3 = iArr[i4 - 1]) < 0) {
                v3 = null;
            } else {
                if (i4 <= 0) {
                    throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()".toString());
                }
                L.d dVar = dVarArr[i2];
                z2.h.c(dVar);
                if (i3 > 0) {
                    iArr[i2] = iArr[i2] - 1;
                } else if (i3 == 0) {
                    dVarArr[i2] = null;
                    i4--;
                }
                v3 = (C1236E) dVar.f4618h[i3];
            }
            nVar3 = null;
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j3) {
        this.f11183U = j3;
    }

    public final void setOnViewTreeOwnersAvailable(y2.c cVar) {
        C1295l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            cVar.l(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f11189d0 = cVar;
    }

    public void setShowLayoutBounds(boolean z3) {
        this.f11171I = z3;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(boolean z3) {
        C1310t c1310t;
        t0.Q q = this.f11176N;
        if (q.f10500b.g() || ((L.d) q.f10503e.f239c).l()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z3) {
                try {
                    c1310t = this.f11161A0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                c1310t = null;
            }
            if (q.j(c1310t)) {
                requestLayout();
            }
            q.a(false);
            Trace.endSection();
        }
    }

    public final void u(C1236E c1236e, long j3) {
        t0.Q q = this.f11176N;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            q.k(c1236e, j3);
            if (!q.f10500b.g()) {
                q.a(false);
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void v(t0.e0 e0Var, boolean z3) {
        ArrayList arrayList = this.f11223y;
        if (!z3) {
            if (this.f11160A) {
                return;
            }
            arrayList.remove(e0Var);
            ArrayList arrayList2 = this.f11225z;
            if (arrayList2 != null) {
                arrayList2.remove(e0Var);
                return;
            }
            return;
        }
        if (!this.f11160A) {
            arrayList.add(e0Var);
            return;
        }
        ArrayList arrayList3 = this.f11225z;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f11225z = arrayList3;
        }
        arrayList3.add(e0Var);
    }

    public final void w() {
        if (this.F) {
            T.w wVar = getSnapshotObserver().f10585a;
            synchronized (wVar.f5751f) {
                try {
                    L.d dVar = wVar.f5751f;
                    int i2 = dVar.f4620j;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        T.v vVar = (T.v) dVar.f4618h[i4];
                        vVar.e();
                        if (!(vVar.f5739f.f8069e != 0)) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr = dVar.f4618h;
                            objArr[i4 - i3] = objArr[i4];
                        }
                    }
                    int i5 = i2 - i3;
                    AbstractC0959k.u(dVar.f4618h, null, i5, i2);
                    dVar.f4620j = i5;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.F = false;
        }
        C1280d0 c1280d0 = this.f11172J;
        if (c1280d0 != null) {
            i(c1280d0);
        }
        while (this.f11220w0.l()) {
            int i6 = this.f11220w0.f4620j;
            for (int i7 = 0; i7 < i6; i7++) {
                Object[] objArr2 = this.f11220w0.f4618h;
                y2.a aVar = (y2.a) objArr2[i7];
                objArr2[i7] = null;
                if (aVar != null) {
                    aVar.c();
                }
            }
            this.f11220w0.o(0, i6);
        }
    }

    public final b0.d x() {
        if (isFocused()) {
            C0442s g3 = AbstractC0427d.g(((androidx.compose.ui.focus.b) getFocusOwner()).f6746f);
            if (g3 != null) {
                return AbstractC0427d.j(g3);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return AbstractC0427d.d(findFocus);
        }
        return null;
    }

    public final void y(C1236E c1236e) {
        G g3 = this.f11214t;
        g3.f10894y = true;
        if (g3.r()) {
            g3.t(c1236e);
        }
        X.c cVar = this.f11216u;
        cVar.f6192o = true;
        if (cVar.h() && cVar.f6193p.add(c1236e)) {
            cVar.q.q(C0880v.f8657a);
        }
    }

    public final void z(C1236E c1236e, boolean z3, boolean z4, boolean z5) {
        C1236E s3;
        C1236E s4;
        C1241J c1241j;
        C1237F c1237f;
        t0.Q q = this.f11176N;
        if (!z3) {
            if (q.p(c1236e, z4) && z5) {
                E(c1236e);
                return;
            }
            return;
        }
        q.getClass();
        if (c1236e.f10389j == null) {
            AbstractC0946A.r("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            throw null;
        }
        t0.L l3 = c1236e.f10379D;
        int d3 = AbstractC0837j.d(l3.f10466c);
        if (d3 != 0) {
            if (d3 == 1) {
                return;
            }
            if (d3 != 2 && d3 != 3) {
                if (d3 != 4) {
                    throw new J2.r();
                }
                if (!l3.f10470g || z4) {
                    l3.f10470g = true;
                    l3.f10467d = true;
                    if (c1236e.f10384K) {
                        return;
                    }
                    boolean a3 = z2.h.a(c1236e.F(), Boolean.TRUE);
                    K1.l lVar = q.f10500b;
                    if ((a3 || (l3.f10470g && (c1236e.q() == 1 || !((c1241j = l3.f10481s) == null || (c1237f = c1241j.f10436y) == null || !c1237f.f())))) && ((s3 = c1236e.s()) == null || !s3.f10379D.f10470g)) {
                        lVar.e(c1236e, true);
                    } else if ((c1236e.E() || t0.Q.h(c1236e)) && ((s4 = c1236e.s()) == null || !s4.f10379D.f10467d)) {
                        lVar.e(c1236e, false);
                    }
                    if (q.f10502d || !z5) {
                        return;
                    }
                    E(c1236e);
                    return;
                }
                return;
            }
        }
        q.f10506h.b(new t0.P(c1236e, true, z4));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        z2.h.c(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i2, layoutParams, true);
    }

    public C1285g getAccessibilityManager() {
        return this.f11218v;
    }

    public C1287h getClipboardManager() {
        return this.f11169G;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, int i3) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i2;
        generateDefaultLayoutParams.height = i3;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i2, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
