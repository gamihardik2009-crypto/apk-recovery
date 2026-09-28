package R0;

import J.AbstractC0288s;
import J.C0257c;
import J.C0274k0;
import J.C0285q;
import J.C0291t0;
import J.F;
import J.W;
import a.AbstractC0423a;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.Q;
import com.example.bulksmsscheduler.R;
import java.util.UUID;
import n2.AbstractC0962n;
import r0.InterfaceC1129r;
import u0.AbstractC1273a;

/* loaded from: classes.dex */
public final class x extends AbstractC1273a {

    /* renamed from: A, reason: collision with root package name */
    public O0.i f5450A;

    /* renamed from: B, reason: collision with root package name */
    public final F f5451B;

    /* renamed from: C, reason: collision with root package name */
    public final Rect f5452C;

    /* renamed from: D, reason: collision with root package name */
    public final T.w f5453D;
    public Object E;
    public final C0274k0 F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f5454G;

    /* renamed from: H, reason: collision with root package name */
    public final int[] f5455H;

    /* renamed from: p, reason: collision with root package name */
    public y2.a f5456p;
    public B q;

    /* renamed from: r, reason: collision with root package name */
    public String f5457r;

    /* renamed from: s, reason: collision with root package name */
    public final View f5458s;

    /* renamed from: t, reason: collision with root package name */
    public final z f5459t;

    /* renamed from: u, reason: collision with root package name */
    public final WindowManager f5460u;

    /* renamed from: v, reason: collision with root package name */
    public final WindowManager.LayoutParams f5461v;

    /* renamed from: w, reason: collision with root package name */
    public A f5462w;

    /* renamed from: x, reason: collision with root package name */
    public O0.k f5463x;

    /* renamed from: y, reason: collision with root package name */
    public final C0274k0 f5464y;

    /* renamed from: z, reason: collision with root package name */
    public final C0274k0 f5465z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y2.a aVar, B b3, String str, View view, O0.b bVar, A a3, UUID uuid) {
        super(view.getContext());
        z yVar = Build.VERSION.SDK_INT >= 29 ? new y() : new z();
        this.f5456p = aVar;
        this.q = b3;
        this.f5457r = str;
        this.f5458s = view;
        this.f5459t = yVar;
        Object systemService = view.getContext().getSystemService("window");
        z2.h.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f5460u = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        B b4 = this.q;
        boolean b5 = k.b(view);
        boolean z3 = b4.f5381b;
        int i2 = b4.f5380a;
        if (z3 && b5) {
            i2 |= 8192;
        } else if (z3 && !b5) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f5461v = layoutParams;
        this.f5462w = a3;
        this.f5463x = O0.k.f5148h;
        W w2 = W.f4109m;
        this.f5464y = C0257c.N(null, w2);
        this.f5465z = C0257c.N(null, w2);
        this.f5451B = C0257c.F(new B.y(17, this));
        this.f5452C = new Rect();
        this.f5453D = new T.w(new j(this, 2));
        setId(android.R.id.content);
        Q.l(this, Q.g(view));
        setTag(R.id.view_tree_view_model_store_owner, Q.h(view));
        AbstractC0962n.p(this, AbstractC0962n.h(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(bVar.P((float) 8));
        setOutlineProvider(new t(1));
        this.F = C0257c.N(p.f5422a, w2);
        this.f5455H = new int[2];
    }

    private final y2.e getContent() {
        return (y2.e) this.F.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1129r getParentLayoutCoordinates() {
        return (InterfaceC1129r) this.f5465z.getValue();
    }

    private final void setContent(y2.e eVar) {
        this.F.setValue(eVar);
    }

    private final void setParentLayoutCoordinates(InterfaceC1129r interfaceC1129r) {
        this.f5465z.setValue(interfaceC1129r);
    }

    @Override // u0.AbstractC1273a
    public final void a(int i2, C0285q c0285q) {
        int i3;
        c0285q.W(-857613600);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.i(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            getContent().j(c0285q, 0);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new q(i2, 1, this);
        }
    }

    @Override // u0.AbstractC1273a
    public final void d(boolean z3, int i2, int i3, int i4, int i5) {
        super.d(z3, i2, i3, i4, i5);
        this.q.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f5461v;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f5459t.getClass();
        this.f5460u.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.q.f5382c) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                y2.a aVar = this.f5456p;
                if (aVar != null) {
                    aVar.c();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // u0.AbstractC1273a
    public final void e(int i2, int i3) {
        this.q.getClass();
        super.e(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f5451B.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f5461v;
    }

    public final O0.k getParentLayoutDirection() {
        return this.f5463x;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final O0.j m0getPopupContentSizebOM6tXw() {
        return (O0.j) this.f5464y.getValue();
    }

    public final A getPositionProvider() {
        return this.f5462w;
    }

    @Override // u0.AbstractC1273a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f5454G;
    }

    public AbstractC1273a getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f5457r;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void h(AbstractC0288s abstractC0288s, y2.e eVar) {
        setParentCompositionContext(abstractC0288s);
        setContent(eVar);
        this.f5454G = true;
    }

    public final void i(y2.a aVar, B b3, String str, O0.k kVar) {
        int i2;
        this.f5456p = aVar;
        this.f5457r = str;
        if (!z2.h.a(this.q, b3)) {
            b3.getClass();
            WindowManager.LayoutParams layoutParams = this.f5461v;
            this.q = b3;
            boolean b4 = k.b(this.f5458s);
            boolean z3 = b3.f5381b;
            int i3 = b3.f5380a;
            if (z3 && b4) {
                i3 |= 8192;
            } else if (z3 && !b4) {
                i3 &= -8193;
            }
            layoutParams.flags = i3;
            this.f5459t.getClass();
            this.f5460u.updateViewLayout(this, layoutParams);
        }
        int ordinal = kVar.ordinal();
        if (ordinal != 0) {
            i2 = 1;
            if (ordinal != 1) {
                throw new J2.r();
            }
        } else {
            i2 = 0;
        }
        super.setLayoutDirection(i2);
    }

    public final void j() {
        InterfaceC1129r parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.n()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long H3 = parentLayoutCoordinates.H();
            long k3 = parentLayoutCoordinates.k(0L);
            long m3 = AbstractC0423a.m(Math.round(b0.c.d(k3)), Math.round(b0.c.e(k3)));
            int i2 = (int) (m3 >> 32);
            int i3 = (int) (m3 & 4294967295L);
            O0.i iVar = new O0.i(i2, i3, ((int) (H3 >> 32)) + i2, ((int) (H3 & 4294967295L)) + i3);
            if (z2.h.a(iVar, this.f5450A)) {
                return;
            }
            this.f5450A = iVar;
            l();
        }
    }

    public final void k(InterfaceC1129r interfaceC1129r) {
        setParentLayoutCoordinates(interfaceC1129r);
        j();
    }

    public final void l() {
        O0.j m0getPopupContentSizebOM6tXw;
        O0.i iVar = this.f5450A;
        if (iVar == null || (m0getPopupContentSizebOM6tXw = m0getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        z zVar = this.f5459t;
        zVar.getClass();
        View view = this.f5458s;
        Rect rect = this.f5452C;
        view.getWindowVisibleDisplayFrame(rect);
        long e3 = l0.c.e(rect.right - rect.left, rect.bottom - rect.top);
        z2.r rVar = new z2.r();
        rVar.f11908h = 0L;
        this.f5453D.c(this, c.f5394o, new w(rVar, this, iVar, e3, m0getPopupContentSizebOM6tXw.f5147a));
        WindowManager.LayoutParams layoutParams = this.f5461v;
        long j3 = rVar.f11908h;
        layoutParams.x = (int) (j3 >> 32);
        layoutParams.y = (int) (j3 & 4294967295L);
        if (this.q.f5384e) {
            zVar.a(this, (int) (e3 >> 32), (int) (e3 & 4294967295L));
        }
        zVar.getClass();
        this.f5460u.updateViewLayout(this, layoutParams);
    }

    @Override // u0.AbstractC1273a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5453D.d();
        if (!this.q.f5382c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.E == null) {
            this.E = m.a(this.f5456p);
        }
        m.b(this, this.E);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        T.w wVar = this.f5453D;
        C1.q qVar = wVar.f5752g;
        if (qVar != null) {
            qVar.b();
        }
        wVar.b();
        if (Build.VERSION.SDK_INT >= 33) {
            m.c(this, this.E);
        }
        this.E = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.q.f5383d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            y2.a aVar = this.f5456p;
            if (aVar != null) {
                aVar.c();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        y2.a aVar2 = this.f5456p;
        if (aVar2 != null) {
            aVar2.c();
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
    }

    public final void setParentLayoutDirection(O0.k kVar) {
        this.f5463x = kVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m1setPopupContentSizefhxjrPA(O0.j jVar) {
        this.f5464y.setValue(jVar);
    }

    public final void setPositionProvider(A a3) {
        this.f5462w = a3;
    }

    public final void setTestTag(String str) {
        this.f5457r = str;
    }
}
