package s;

import J.C0257c;
import J.C0275l;
import J.C0285q;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import p.C1007b;

/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1165d implements InterfaceC1169h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10127a;

    public /* synthetic */ C1165d(int i2) {
        this.f10127a = i2;
    }

    public static final C1164c b(String str, int i2) {
        WeakHashMap weakHashMap = Z.f10091u;
        return new C1164c(str, i2);
    }

    public static final X d(String str, int i2) {
        WeakHashMap weakHashMap = Z.f10091u;
        return new X(new C1152E(0, 0, 0, 0), str);
    }

    public static Z e(C0285q c0285q) {
        Z z3;
        View view = (View) c0285q.l(AndroidCompositionLocals_androidKt.f6785f);
        WeakHashMap weakHashMap = Z.f10091u;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new Z(view);
                    weakHashMap.put(view, obj);
                }
                z3 = (Z) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean i2 = c0285q.i(z3) | c0285q.i(view);
        Object K3 = c0285q.K();
        if (i2 || K3 == C0275l.f4150a) {
            K3 = new C1007b(z3, 6, view);
            c0285q.e0(K3);
        }
        C0257c.d(z3, (y2.c) K3, c0285q);
        return z3;
    }

    @Override // s.InterfaceC1169h
    public void c(O0.b bVar, int i2, int[] iArr, O0.k kVar, int[] iArr2) {
        switch (this.f10127a) {
            case 0:
                AbstractC1173l.b(iArr, iArr2, false);
                break;
            case 1:
                AbstractC1173l.c(i2, iArr, iArr2, false);
                break;
            case 2:
                if (kVar != O0.k.f5148h) {
                    AbstractC1173l.b(iArr, iArr2, true);
                    break;
                } else {
                    AbstractC1173l.c(i2, iArr, iArr2, false);
                    break;
                }
            default:
                if (kVar != O0.k.f5148h) {
                    AbstractC1173l.c(i2, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC1173l.b(iArr, iArr2, false);
                    break;
                }
        }
    }

    public String toString() {
        switch (this.f10127a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#End";
            case 3:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
