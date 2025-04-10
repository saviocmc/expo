@file:Suppress("UnusedImport") // this needs to stay for versioning to work

package host.exp.exponent.experience.splashscreen.legacy

import android.content.Context
import androidx.core.content.ContextCompat
import host.exp.expoview.R

/**
 * Default implementation that uses native resources.
 */
class NativeResourcesBasedSplashScreenViewProvider(
  private val resizeMode: SplashScreenImageResizeMode
) : SplashScreenViewProvider {

  override fun createSplashScreenView(context: Context): SplashScreenView {
    val splashScreenView = SplashScreenView(context)
    splashScreenView.setBackgroundColor(getBackgroundColor(context))

    splashScreenView.imageView.setImageResource(getImageResource())
    splashScreenView.configureImageViewResizeMode(resizeMode)

    return splashScreenView
  }

  private fun getBackgroundColor(context: Context): Int {
    return ContextCompat.getColor(context, R.color.splashscreen_background)
  }

  private fun getImageResource(): Int {
    if (resizeMode === SplashScreenImageResizeMode.NATIVE) {
      return R.drawable.splashscreen
    }
    return R.drawable.splashscreen
  }
}
