package o2;

import android.util.Log;
import q1.InterfaceC1061c;
import q2.InterfaceC1077h;
import s.AbstractC1166e;
import v1.C1369a;
import v1.InterfaceC1370b;
import w1.C1385g;

/* renamed from: o2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0997c implements InterfaceC1061c, InterfaceC1077h, InterfaceC1370b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9335h;

    public /* synthetic */ C0997c(int i2) {
        this.f9335h = i2;
    }

    private final void b() {
    }

    private final void c(int i2, Object obj) {
    }

    @Override // v1.InterfaceC1370b
    public v1.c a(C1369a c1369a) {
        return new C1385g(c1369a.f11400a, c1369a.f11401b, c1369a.f11402c, c1369a.f11403d, c1369a.f11404e);
    }

    @Override // q1.InterfaceC1061c
    public void f() {
        switch (this.f9335h) {
            case 1:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // q1.InterfaceC1061c
    public void h(int i2, Object obj) {
        String str;
        switch (this.f9335h) {
            case 1:
                break;
            default:
                switch (i2) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case AbstractC1166e.f10138f /* 5 */:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case AbstractC1166e.f10136d /* 6 */:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case AbstractC1166e.f10135c /* 9 */:
                    default:
                        str = "";
                        break;
                    case AbstractC1166e.f10137e /* 10 */:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i2 != 6 && i2 != 7 && i2 != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    break;
                }
                break;
        }
    }

    public C0997c(int i2, int i3) {
        this.f9335h = 6;
    }
}
