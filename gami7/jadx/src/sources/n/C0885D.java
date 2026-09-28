package n;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: n.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0885D {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8669a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8670b;

    /* renamed from: c, reason: collision with root package name */
    public long f8671c = 0;

    /* renamed from: d, reason: collision with root package name */
    public EdgeEffect f8672d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f8673e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f8674f;

    /* renamed from: g, reason: collision with root package name */
    public EdgeEffect f8675g;

    /* renamed from: h, reason: collision with root package name */
    public EdgeEffect f8676h;

    /* renamed from: i, reason: collision with root package name */
    public EdgeEffect f8677i;

    /* renamed from: j, reason: collision with root package name */
    public EdgeEffect f8678j;

    /* renamed from: k, reason: collision with root package name */
    public EdgeEffect f8679k;

    public C0885D(Context context, int i2) {
        this.f8669a = context;
        this.f8670b = i2;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? C0906n.f8812a.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a() {
        int i2 = Build.VERSION.SDK_INT;
        Context context = this.f8669a;
        EdgeEffect a3 = i2 >= 31 ? C0906n.f8812a.a(context, null) : new M(context);
        a3.setColor(this.f8670b);
        if (!O0.j.a(this.f8671c, 0L)) {
            long j3 = this.f8671c;
            a3.setSize((int) (j3 >> 32), (int) (j3 & 4294967295L));
        }
        return a3;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f8673e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a3 = a();
        this.f8673e = a3;
        return a3;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f8674f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a3 = a();
        this.f8674f = a3;
        return a3;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f8675g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a3 = a();
        this.f8675g = a3;
        return a3;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f8672d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a3 = a();
        this.f8672d = a3;
        return a3;
    }
}
