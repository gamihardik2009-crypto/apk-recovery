package u0;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import n2.AbstractC0948C;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public final class O extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10956i;

    /* renamed from: j, reason: collision with root package name */
    public static final O f10940j = new O(0, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final O f10941k = new O(0, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final O f10942l = new O(0, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final O f10943m = new O(0, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final O f10944n = new O(0, 4);

    /* renamed from: o, reason: collision with root package name */
    public static final O f10945o = new O(0, 5);

    /* renamed from: p, reason: collision with root package name */
    public static final O f10946p = new O(0, 6);
    public static final O q = new O(0, 7);

    /* renamed from: r, reason: collision with root package name */
    public static final O f10947r = new O(0, 8);

    /* renamed from: s, reason: collision with root package name */
    public static final O f10948s = new O(0, 9);

    /* renamed from: t, reason: collision with root package name */
    public static final O f10949t = new O(0, 10);

    /* renamed from: u, reason: collision with root package name */
    public static final O f10950u = new O(0, 11);

    /* renamed from: v, reason: collision with root package name */
    public static final O f10951v = new O(0, 12);

    /* renamed from: w, reason: collision with root package name */
    public static final O f10952w = new O(0, 13);

    /* renamed from: x, reason: collision with root package name */
    public static final O f10953x = new O(0, 14);

    /* renamed from: y, reason: collision with root package name */
    public static final O f10954y = new O(0, 15);

    /* renamed from: z, reason: collision with root package name */
    public static final O f10955z = new O(0, 16);

    /* renamed from: A, reason: collision with root package name */
    public static final O f10930A = new O(0, 17);

    /* renamed from: B, reason: collision with root package name */
    public static final O f10931B = new O(0, 18);

    /* renamed from: C, reason: collision with root package name */
    public static final O f10932C = new O(0, 19);

    /* renamed from: D, reason: collision with root package name */
    public static final O f10933D = new O(0, 20);
    public static final O E = new O(0, 21);
    public static final O F = new O(0, 22);

    /* renamed from: G, reason: collision with root package name */
    public static final O f10934G = new O(0, 23);

    /* renamed from: H, reason: collision with root package name */
    public static final O f10935H = new O(0, 24);

    /* renamed from: I, reason: collision with root package name */
    public static final O f10936I = new O(0, 25);

    /* renamed from: J, reason: collision with root package name */
    public static final O f10937J = new O(0, 26);

    /* renamed from: K, reason: collision with root package name */
    public static final O f10938K = new O(0, 27);

    /* renamed from: L, reason: collision with root package name */
    public static final O f10939L = new O(0, 28);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(int i2, int i3) {
        super(i2);
        this.f10956i = i3;
    }

    @Override // y2.a
    public final Object c() {
        Choreographer choreographer;
        switch (this.f10956i) {
            case 0:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.b("LocalSavedStateRegistryOwner");
                throw null;
            case AbstractC1166e.f10138f /* 5 */:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case AbstractC1166e.f10136d /* 6 */:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    Q2.d dVar = J2.H.f4356a;
                    choreographer = (Choreographer) J2.B.u(O2.o.f5202a, new W(2, null));
                }
                Y y3 = new Y(choreographer, C1.y.m(Looper.getMainLooper()));
                return AbstractC0948C.n(y3, y3.f11015s);
            case 7:
            case 8:
                return null;
            case AbstractC1166e.f10135c /* 9 */:
                AbstractC1296l0.b("LocalAutofillTree");
                throw null;
            case AbstractC1166e.f10137e /* 10 */:
                AbstractC1296l0.b("LocalClipboardManager");
                throw null;
            case 11:
                AbstractC1296l0.b("LocalDensity");
                throw null;
            case 12:
                AbstractC1296l0.b("LocalFocusManager");
                throw null;
            case 13:
                AbstractC1296l0.b("LocalFontFamilyResolver");
                throw null;
            case 14:
                AbstractC1296l0.b("LocalFontLoader");
                throw null;
            case AbstractC1166e.f10139g /* 15 */:
                AbstractC1296l0.b("LocalGraphicsContext");
                throw null;
            case 16:
                AbstractC1296l0.b("LocalHapticFeedback");
                throw null;
            case 17:
                AbstractC1296l0.b("LocalInputManager");
                throw null;
            case 18:
                AbstractC1296l0.b("LocalLayoutDirection");
                throw null;
            case 19:
                return null;
            case 20:
                return Boolean.FALSE;
            case 21:
            case 22:
                return null;
            case 23:
                AbstractC1296l0.b("LocalTextToolbar");
                throw null;
            case 24:
                AbstractC1296l0.b("LocalUriHandler");
                throw null;
            case 25:
                AbstractC1296l0.b("LocalViewConfiguration");
                throw null;
            case 26:
                AbstractC1296l0.b("LocalWindowInfo");
                throw null;
            case 27:
                return Boolean.FALSE;
            default:
                return null;
        }
    }
}
