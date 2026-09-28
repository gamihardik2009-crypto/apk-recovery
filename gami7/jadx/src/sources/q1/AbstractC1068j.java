package q1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import o2.C0997c;

/* renamed from: q1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1068j {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.h f9770a = new S0.h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f9771b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C0997c f9772c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC1066h.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static C0997c b() {
        C0997c c0997c = new C0997c(4);
        f9772c = c0997c;
        S0.h hVar = f9770a;
        hVar.getClass();
        if (S0.g.f5590f.s(hVar, null, c0997c)) {
            S0.g.c(hVar);
        }
        return f9772c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:64|65)(1:28)|29|(8:36|(1:40)|(1:59)(1:47)|48|(2:55|56)|52|53|54)|(1:63)|(1:40)|(1:42)|59|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009d, code lost:
    
        r4 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.AbstractC1068j.c(android.content.Context, boolean):void");
    }
}
