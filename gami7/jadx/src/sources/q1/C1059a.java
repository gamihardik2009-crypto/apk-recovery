package q1;

import android.content.res.AssetManager;
import android.os.Build;
import b.RunnableC0486j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1059a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f9737a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1061c f9738b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9739c;

    /* renamed from: d, reason: collision with root package name */
    public final File f9740d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9741e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9742f = false;

    /* renamed from: g, reason: collision with root package name */
    public C1060b[] f9743g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f9744h;

    public C1059a(AssetManager assetManager, Executor executor, InterfaceC1061c interfaceC1061c, String str, File file) {
        this.f9737a = executor;
        this.f9738b = interfaceC1061c;
        this.f9741e = str;
        this.f9740d = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 34) {
            switch (i2) {
                case 26:
                    bArr = AbstractC1062d.f9760g;
                    break;
                case 27:
                    bArr = AbstractC1062d.f9759f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC1062d.f9758e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = AbstractC1062d.f9757d;
                    break;
            }
        }
        this.f9739c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f9738b.f();
            }
            return null;
        }
    }

    public final void b(int i2, Serializable serializable) {
        this.f9737a.execute(new RunnableC0486j(i2, 2, this, serializable));
    }
}
