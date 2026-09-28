package b1;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: b1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0509F extends AbstractC0512I {

    /* renamed from: e, reason: collision with root package name */
    public static Field f7085e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f7086f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f7087g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f7088h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f7089c;

    /* renamed from: d, reason: collision with root package name */
    public W0.b f7090d;

    public C0509F() {
        this.f7089c = i();
    }

    private static WindowInsets i() {
        if (!f7086f) {
            try {
                f7085e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e3);
            }
            f7086f = true;
        }
        Field field = f7085e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e4);
            }
        }
        if (!f7088h) {
            try {
                f7087g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e5);
            }
            f7088h = true;
        }
        Constructor constructor = f7087g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e6);
            }
        }
        return null;
    }

    @Override // b1.AbstractC0512I
    public C0521S b() {
        a();
        C0521S b3 = C0521S.b(null, this.f7089c);
        W0.b[] bVarArr = this.f7093b;
        C0518O c0518o = b3.f7111a;
        c0518o.p(bVarArr);
        c0518o.r(this.f7090d);
        return b3;
    }

    @Override // b1.AbstractC0512I
    public void e(W0.b bVar) {
        this.f7090d = bVar;
    }

    @Override // b1.AbstractC0512I
    public void g(W0.b bVar) {
        WindowInsets windowInsets = this.f7089c;
        if (windowInsets != null) {
            this.f7089c = windowInsets.replaceSystemWindowInsets(bVar.f5891a, bVar.f5892b, bVar.f5893c, bVar.f5894d);
        }
    }

    public C0509F(C0521S c0521s) {
        super(c0521s);
        this.f7089c = c0521s.a();
    }
}
