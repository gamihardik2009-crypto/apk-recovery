package b;

import B.F;
import D.S;
import a1.InterfaceC0445a;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.lifecycle.C0472v;
import androidx.lifecycle.EnumC0465n;
import androidx.lifecycle.EnumC0466o;
import androidx.lifecycle.InterfaceC0461j;
import androidx.lifecycle.InterfaceC0470t;
import androidx.lifecycle.L;
import androidx.lifecycle.M;
import androidx.lifecycle.Q;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import b1.AbstractC0542s;
import b1.C0541r;
import com.example.bulksmsscheduler.R;
import d.C0629a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k1.C0784b;
import m2.C0870l;
import n2.AbstractC0946A;
import n2.AbstractC0962n;
import u1.C1325b;

/* renamed from: b.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0489m extends Activity implements c0, InterfaceC0461j, u1.f, InterfaceC0501y, e.e, InterfaceC0470t {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f7000z = 0;

    /* renamed from: h, reason: collision with root package name */
    public final C0472v f7001h = new C0472v(this);

    /* renamed from: i, reason: collision with root package name */
    public final C0629a f7002i;

    /* renamed from: j, reason: collision with root package name */
    public final F f7003j;

    /* renamed from: k, reason: collision with root package name */
    public final S f7004k;

    /* renamed from: l, reason: collision with root package name */
    public b0 f7005l;

    /* renamed from: m, reason: collision with root package name */
    public final ViewTreeObserverOnDrawListenerC0485i f7006m;

    /* renamed from: n, reason: collision with root package name */
    public final C0870l f7007n;

    /* renamed from: o, reason: collision with root package name */
    public final C0487k f7008o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f7009p;
    public final CopyOnWriteArrayList q;

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f7010r;

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f7011s;

    /* renamed from: t, reason: collision with root package name */
    public final CopyOnWriteArrayList f7012t;

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f7013u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7014v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7015w;

    /* renamed from: x, reason: collision with root package name */
    public final C0870l f7016x;

    /* renamed from: y, reason: collision with root package name */
    public final C0870l f7017y;

    public AbstractActivityC0489m() {
        C0629a c0629a = new C0629a();
        this.f7002i = c0629a;
        this.f7003j = new F(14);
        S s3 = new S(this);
        this.f7004k = s3;
        this.f7006m = new ViewTreeObserverOnDrawListenerC0485i(this);
        this.f7007n = new C0870l(new C0488l(this, 2));
        new AtomicInteger();
        this.f7008o = new C0487k(this);
        this.f7009p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.f7010r = new CopyOnWriteArrayList();
        this.f7011s = new CopyOnWriteArrayList();
        this.f7012t = new CopyOnWriteArrayList();
        this.f7013u = new CopyOnWriteArrayList();
        C0472v c0472v = this.f7001h;
        if (c0472v == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.".toString());
        }
        final int i2 = 0;
        c0472v.a(new androidx.lifecycle.r(this) { // from class: b.d

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0489m f6976i;

            {
                this.f6976i = this;
            }

            @Override // androidx.lifecycle.r
            public final void d(InterfaceC0470t interfaceC0470t, EnumC0465n enumC0465n) {
                Window window;
                View peekDecorView;
                switch (i2) {
                    case 0:
                        AbstractActivityC0489m abstractActivityC0489m = this.f6976i;
                        z2.h.f(abstractActivityC0489m, "this$0");
                        if (enumC0465n == EnumC0465n.ON_STOP && (window = abstractActivityC0489m.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0489m abstractActivityC0489m2 = this.f6976i;
                        z2.h.f(abstractActivityC0489m2, "this$0");
                        if (enumC0465n == EnumC0465n.ON_DESTROY) {
                            abstractActivityC0489m2.f7002i.f7388b = null;
                            if (!abstractActivityC0489m2.isChangingConfigurations()) {
                                abstractActivityC0489m2.d().a();
                            }
                            ViewTreeObserverOnDrawListenerC0485i viewTreeObserverOnDrawListenerC0485i = abstractActivityC0489m2.f7006m;
                            AbstractActivityC0489m abstractActivityC0489m3 = viewTreeObserverOnDrawListenerC0485i.f6985k;
                            abstractActivityC0489m3.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0485i);
                            abstractActivityC0489m3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0485i);
                            break;
                        }
                        break;
                }
            }
        });
        final int i3 = 1;
        this.f7001h.a(new androidx.lifecycle.r(this) { // from class: b.d

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0489m f6976i;

            {
                this.f6976i = this;
            }

            @Override // androidx.lifecycle.r
            public final void d(InterfaceC0470t interfaceC0470t, EnumC0465n enumC0465n) {
                Window window;
                View peekDecorView;
                switch (i3) {
                    case 0:
                        AbstractActivityC0489m abstractActivityC0489m = this.f6976i;
                        z2.h.f(abstractActivityC0489m, "this$0");
                        if (enumC0465n == EnumC0465n.ON_STOP && (window = abstractActivityC0489m.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0489m abstractActivityC0489m2 = this.f6976i;
                        z2.h.f(abstractActivityC0489m2, "this$0");
                        if (enumC0465n == EnumC0465n.ON_DESTROY) {
                            abstractActivityC0489m2.f7002i.f7388b = null;
                            if (!abstractActivityC0489m2.isChangingConfigurations()) {
                                abstractActivityC0489m2.d().a();
                            }
                            ViewTreeObserverOnDrawListenerC0485i viewTreeObserverOnDrawListenerC0485i = abstractActivityC0489m2.f7006m;
                            AbstractActivityC0489m abstractActivityC0489m3 = viewTreeObserverOnDrawListenerC0485i.f6985k;
                            abstractActivityC0489m3.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0485i);
                            abstractActivityC0489m3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0485i);
                            break;
                        }
                        break;
                }
            }
        });
        this.f7001h.a(new C1325b(3, this));
        s3.g();
        Q.f(this);
        ((u1.e) s3.f764d).c("android:support:activity-result", new M(1, this));
        C0481e c0481e = new C0481e(this);
        Context context = c0629a.f7388b;
        if (context != null) {
            c0481e.a(context);
        }
        c0629a.f7387a.add(c0481e);
        this.f7016x = new C0870l(new C0488l(this, 0));
        this.f7017y = new C0870l(new C0488l(this, 3));
    }

    @Override // androidx.lifecycle.InterfaceC0461j
    public final C0784b a() {
        C0784b c0784b = new C0784b();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0784b.f1200h;
        if (application != null) {
            C1.b bVar = Y.f6877d;
            Application application2 = getApplication();
            z2.h.e(application2, "application");
            linkedHashMap.put(bVar, application2);
        }
        linkedHashMap.put(Q.f6856a, this);
        linkedHashMap.put(Q.f6857b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(Q.f6858c, extras);
        }
        return c0784b;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        View decorView = getWindow().getDecorView();
        z2.h.e(decorView, "window.decorView");
        this.f7006m.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // b.InterfaceC0501y
    public final C0499w b() {
        return (C0499w) this.f7017y.getValue();
    }

    @Override // u1.f
    public final u1.e c() {
        return (u1.e) this.f7004k.f764d;
    }

    @Override // androidx.lifecycle.c0
    public final b0 d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.".toString());
        }
        if (this.f7005l == null) {
            C0484h c0484h = (C0484h) getLastNonConfigurationInstance();
            if (c0484h != null) {
                this.f7005l = c0484h.f6981a;
            }
            if (this.f7005l == null) {
                this.f7005l = new b0();
            }
        }
        b0 b0Var = this.f7005l;
        z2.h.c(b0Var);
        return b0Var;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        z2.h.f(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        z2.h.e(decorView, "window.decorView");
        if (B2.a.m(decorView, keyEvent)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return super.dispatchKeyEvent(keyEvent);
        }
        onUserInteraction();
        Window window = getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!B2.a.f320f) {
                    try {
                        B2.a.f321g = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    B2.a.f320f = true;
                }
                Method method = B2.a.f321g;
                if (method != null) {
                    try {
                        Object invoke = method.invoke(actionBar, keyEvent);
                        if (invoke != null) {
                            if (((Boolean) invoke).booleanValue()) {
                                return true;
                            }
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window.getDecorView();
        int i2 = AbstractC0542s.f7132a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = C0541r.f7128d;
            C0541r c0541r = (C0541r) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (c0541r == null) {
                c0541r = new C0541r();
                c0541r.f7129a = null;
                c0541r.f7130b = null;
                c0541r.f7131c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, c0541r);
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = c0541r.f7129a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = C0541r.f7128d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (c0541r.f7129a == null) {
                                c0541r.f7129a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = C0541r.f7128d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    c0541r.f7129a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        c0541r.f7129a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a3 = c0541r.a(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a3 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (c0541r.f7130b == null) {
                        c0541r.f7130b = new SparseArray();
                    }
                    c0541r.f7130b.put(keyCode, new WeakReference(a3));
                }
            }
            if (a3 != null) {
                return true;
            }
        }
        return keyEvent.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        z2.h.f(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        z2.h.e(decorView, "window.decorView");
        if (B2.a.m(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.lifecycle.InterfaceC0470t
    public final C0472v e() {
        return this.f7001h;
    }

    @Override // androidx.lifecycle.InterfaceC0461j
    public final Z f() {
        return (Z) this.f7016x.getValue();
    }

    public final void h() {
        View decorView = getWindow().getDecorView();
        z2.h.e(decorView, "window.decorView");
        Q.l(decorView, this);
        View decorView2 = getWindow().getDecorView();
        z2.h.e(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        z2.h.e(decorView3, "window.decorView");
        AbstractC0962n.p(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        z2.h.e(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        z2.h.e(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final void i(Bundle bundle) {
        super.onCreate(bundle);
        int i2 = L.f6843i;
        Q.k(this);
    }

    public final void j(Bundle bundle) {
        z2.h.f(bundle, "outState");
        this.f7001h.g(EnumC0466o.f6900j);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (this.f7008o.a(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        b().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        z2.h.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.f7009p.iterator();
        while (it.hasNext()) {
            ((InterfaceC0445a) it.next()).a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f7004k.h(bundle);
        C0629a c0629a = this.f7002i;
        c0629a.getClass();
        c0629a.f7388b = this;
        Iterator it = c0629a.f7387a.iterator();
        while (it.hasNext()) {
            ((C0481e) it.next()).a(this);
        }
        i(bundle);
        int i2 = L.f6843i;
        Q.k(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        z2.h.f(menu, "menu");
        if (i2 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f7003j.f165i).iterator();
        if (!it.hasNext()) {
            return true;
        }
        B1.t.w(it.next());
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        z2.h.f(menuItem, "item");
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7003j.f165i).iterator();
        if (!it.hasNext()) {
            return false;
        }
        B1.t.w(it.next());
        throw null;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3) {
        if (this.f7014v) {
            return;
        }
        Iterator it = this.f7011s.iterator();
        while (it.hasNext()) {
            ((InterfaceC0445a) it.next()).a(new C1.b(10, false));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        z2.h.f(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f7010r.iterator();
        while (it.hasNext()) {
            ((InterfaceC0445a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i2, Menu menu) {
        z2.h.f(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f7003j.f165i).iterator();
        if (it.hasNext()) {
            B1.t.w(it.next());
            throw null;
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3) {
        if (this.f7015w) {
            return;
        }
        Iterator it = this.f7012t.iterator();
        while (it.hasNext()) {
            ((InterfaceC0445a) it.next()).a(new C1.b(11, false));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        z2.h.f(menu, "menu");
        if (i2 != 0) {
            return true;
        }
        super.onPreparePanel(i2, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f7003j.f165i).iterator();
        if (!it.hasNext()) {
            return true;
        }
        B1.t.w(it.next());
        throw null;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        z2.h.f(strArr, "permissions");
        z2.h.f(iArr, "grantResults");
        if (this.f7008o.a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0484h c0484h;
        b0 b0Var = this.f7005l;
        if (b0Var == null && (c0484h = (C0484h) getLastNonConfigurationInstance()) != null) {
            b0Var = c0484h.f6981a;
        }
        if (b0Var == null) {
            return null;
        }
        C0484h c0484h2 = new C0484h();
        c0484h2.f6981a = b0Var;
        return c0484h2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        z2.h.f(bundle, "outState");
        C0472v c0472v = this.f7001h;
        if (c0472v instanceof C0472v) {
            z2.h.d(c0472v, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            c0472v.g(EnumC0466o.f6900j);
        }
        j(bundle);
        this.f7004k.i(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((InterfaceC0445a) it.next()).a(Integer.valueOf(i2));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f7013u.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC0946A.l()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0490n c0490n = (C0490n) this.f7007n.getValue();
            synchronized (c0490n.f7018a) {
                try {
                    c0490n.f7019b = true;
                    Iterator it = c0490n.f7020c.iterator();
                    while (it.hasNext()) {
                        ((y2.a) it.next()).c();
                    }
                    c0490n.f7020c.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i2) {
        h();
        View decorView = getWindow().getDecorView();
        z2.h.e(decorView, "window.decorView");
        this.f7006m.a(decorView);
        super.setContentView(i2);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i2) {
        z2.h.f(intent, "intent");
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        z2.h.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        z2.h.f(intent, "intent");
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        z2.h.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        h();
        View decorView = getWindow().getDecorView();
        z2.h.e(decorView, "window.decorView");
        this.f7006m.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3, Configuration configuration) {
        z2.h.f(configuration, "newConfig");
        this.f7014v = true;
        try {
            super.onMultiWindowModeChanged(z3, configuration);
            this.f7014v = false;
            Iterator it = this.f7011s.iterator();
            while (it.hasNext()) {
                ((InterfaceC0445a) it.next()).a(new C1.b(10, false));
            }
        } catch (Throwable th) {
            this.f7014v = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3, Configuration configuration) {
        z2.h.f(configuration, "newConfig");
        this.f7015w = true;
        try {
            super.onPictureInPictureModeChanged(z3, configuration);
            this.f7015w = false;
            Iterator it = this.f7012t.iterator();
            while (it.hasNext()) {
                ((InterfaceC0445a) it.next()).a(new C1.b(11, false));
            }
        } catch (Throwable th) {
            this.f7015w = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        View decorView = getWindow().getDecorView();
        z2.h.e(decorView, "window.decorView");
        this.f7006m.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
