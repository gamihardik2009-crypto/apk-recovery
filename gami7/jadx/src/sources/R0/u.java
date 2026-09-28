package R0;

import D.S;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0472v;
import androidx.lifecycle.EnumC0465n;
import androidx.lifecycle.InterfaceC0470t;
import androidx.lifecycle.Q;
import b.C0499w;
import b.InterfaceC0501y;
import com.example.bulksmsscheduler.R;
import m.AbstractC0837j;
import n2.AbstractC0962n;

/* loaded from: classes.dex */
public final class u extends Dialog implements InterfaceC0470t, InterfaceC0501y, u1.f {

    /* renamed from: h, reason: collision with root package name */
    public C0472v f5435h;

    /* renamed from: i, reason: collision with root package name */
    public final S f5436i;

    /* renamed from: j, reason: collision with root package name */
    public final C0499w f5437j;

    /* renamed from: k, reason: collision with root package name */
    public y2.a f5438k;

    /* renamed from: l, reason: collision with root package name */
    public s f5439l;

    /* renamed from: m, reason: collision with root package name */
    public final View f5440m;

    /* renamed from: n, reason: collision with root package name */
    public final r f5441n;

    /* renamed from: o, reason: collision with root package name */
    public final int f5442o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u(y2.a r7, R0.s r8, android.view.View r9, O0.k r10, O0.b r11, java.util.UUID r12) {
        /*
            r6 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r9.getContext()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 >= r3) goto L15
            boolean r3 = r8.f5433e
            if (r3 == 0) goto L11
            goto L15
        L11:
            r3 = 2131361794(0x7f0a0002, float:1.834335E38)
            goto L17
        L15:
            r3 = 2131361792(0x7f0a0000, float:1.8343346E38)
        L17:
            r0.<init>(r1, r3)
            r1 = 0
            r6.<init>(r0, r1)
            D.S r0 = new D.S
            r0.<init>(r6)
            r6.f5436i = r0
            b.w r0 = new b.w
            B1.e r3 = new B1.e
            r4 = 9
            r3.<init>(r4, r6)
            r0.<init>(r3)
            r6.f5437j = r0
            r6.f5438k = r7
            r6.f5439l = r8
            r6.f5440m = r9
            r7 = 8
            float r7 = (float) r7
            android.view.Window r8 = r6.getWindow()
            if (r8 == 0) goto Le8
            android.view.WindowManager$LayoutParams r3 = r8.getAttributes()
            int r3 = r3.softInputMode
            r3 = r3 & 240(0xf0, float:3.36E-43)
            r6.f5442o = r3
            r3 = 1
            r8.requestFeature(r3)
            r4 = 17170445(0x106000d, float:2.461195E-38)
            r8.setBackgroundDrawableResource(r4)
            R0.s r4 = r6.f5439l
            boolean r4 = r4.f5433e
            r5 = 30
            if (r2 < r5) goto L62
            b1.AbstractC0545v.a(r8, r4)
            goto L74
        L62:
            android.view.View r2 = r8.getDecorView()
            int r5 = r2.getSystemUiVisibility()
            if (r4 == 0) goto L6f
            r4 = r5 & (-1793(0xfffffffffffff8ff, float:NaN))
            goto L71
        L6f:
            r4 = r5 | 1792(0x700, float:2.511E-42)
        L71:
            r2.setSystemUiVisibility(r4)
        L74:
            R0.r r2 = new R0.r
            android.content.Context r4 = r6.getContext()
            r2.<init>(r4, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Dialog:"
            r4.<init>(r5)
            r4.append(r12)
            java.lang.String r12 = r4.toString()
            r4 = 2131099690(0x7f06002a, float:1.781174E38)
            r2.setTag(r4, r12)
            r2.setClipChildren(r1)
            float r7 = r11.P(r7)
            r2.setElevation(r7)
            R0.t r7 = new R0.t
            r11 = 0
            r7.<init>(r11)
            r2.setOutlineProvider(r7)
            r6.f5441n = r2
            android.view.View r7 = r8.getDecorView()
            boolean r8 = r7 instanceof android.view.ViewGroup
            if (r8 == 0) goto Lb1
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto Lb2
        Lb1:
            r7 = 0
        Lb2:
            if (r7 == 0) goto Lb7
            d(r7)
        Lb7:
            r6.setContentView(r2)
            androidx.lifecycle.t r7 = androidx.lifecycle.Q.g(r9)
            androidx.lifecycle.Q.l(r2, r7)
            androidx.lifecycle.c0 r7 = androidx.lifecycle.Q.h(r9)
            r8 = 2131099735(0x7f060057, float:1.7811832E38)
            r2.setTag(r8, r7)
            u1.f r7 = n2.AbstractC0962n.h(r9)
            n2.AbstractC0962n.p(r2, r7)
            y2.a r7 = r6.f5438k
            R0.s r8 = r6.f5439l
            r6.h(r7, r8, r10)
            R0.b r7 = new R0.b
            r8 = 1
            r7.<init>(r6, r8)
            b.x r8 = new b.x
            r8.<init>(r3, r7)
            r0.a(r6, r8)
            return
        Le8:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Dialog has no window"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.u.<init>(y2.a, R0.s, android.view.View, O0.k, O0.b, java.util.UUID):void");
    }

    public static void a(u uVar) {
        z2.h.f(uVar, "this$0");
        super.onBackPressed();
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof r) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        z2.h.f(view, "view");
        g();
        super.addContentView(view, layoutParams);
    }

    @Override // b.InterfaceC0501y
    public final C0499w b() {
        return this.f5437j;
    }

    @Override // u1.f
    public final u1.e c() {
        return (u1.e) this.f5436i.f764d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    @Override // androidx.lifecycle.InterfaceC0470t
    public final C0472v e() {
        return f();
    }

    public final C0472v f() {
        C0472v c0472v = this.f5435h;
        if (c0472v != null) {
            return c0472v;
        }
        C0472v c0472v2 = new C0472v(this);
        this.f5435h = c0472v2;
        return c0472v2;
    }

    public final void g() {
        Window window = getWindow();
        z2.h.c(window);
        View decorView = window.getDecorView();
        z2.h.e(decorView, "window!!.decorView");
        Q.l(decorView, this);
        Window window2 = getWindow();
        z2.h.c(window2);
        View decorView2 = window2.getDecorView();
        z2.h.e(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        z2.h.c(window3);
        View decorView3 = window3.getDecorView();
        z2.h.e(decorView3, "window!!.decorView");
        AbstractC0962n.p(decorView3, this);
    }

    public final void h(y2.a aVar, s sVar, O0.k kVar) {
        Window window;
        this.f5438k = aVar;
        this.f5439l = sVar;
        int i2 = sVar.f5431c;
        boolean b3 = k.b(this.f5440m);
        int d3 = AbstractC0837j.d(i2);
        int i3 = 0;
        if (d3 != 0) {
            if (d3 == 1) {
                b3 = true;
            } else {
                if (d3 != 2) {
                    throw new J2.r();
                }
                b3 = false;
            }
        }
        Window window2 = getWindow();
        z2.h.c(window2);
        window2.setFlags(b3 ? 8192 : -8193, 8192);
        int ordinal = kVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new J2.r();
            }
            i3 = 1;
        }
        r rVar = this.f5441n;
        rVar.setLayoutDirection(i3);
        boolean z3 = sVar.f5432d;
        if (z3 && !rVar.f5427r && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        rVar.f5427r = z3;
        if (Build.VERSION.SDK_INT < 31) {
            if (sVar.f5433e) {
                Window window3 = getWindow();
                if (window3 != null) {
                    window3.setSoftInputMode(this.f5442o);
                    return;
                }
                return;
            }
            Window window4 = getWindow();
            if (window4 != null) {
                window4.setSoftInputMode(16);
            }
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f5437j.c();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            z2.h.e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C0499w c0499w = this.f5437j;
            c0499w.getClass();
            c0499w.f7044e = onBackInvokedDispatcher;
            c0499w.d(c0499w.f7046g);
        }
        this.f5436i.h(bundle);
        f().d(EnumC0465n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        z2.h.e(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f5436i.i(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        f().d(EnumC0465n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        f().d(EnumC0465n.ON_DESTROY);
        this.f5435h = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.f5439l.f5430b) {
            this.f5438k.c();
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog
    public final void setContentView(int i2) {
        g();
        super.setContentView(i2);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        z2.h.f(view, "view");
        g();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        z2.h.f(view, "view");
        g();
        super.setContentView(view, layoutParams);
    }
}
